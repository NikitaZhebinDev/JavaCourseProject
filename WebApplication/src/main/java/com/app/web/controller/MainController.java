package com.app.web.controller;

import com.app.web.domain.*;
import com.app.web.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Map;

import static com.app.web.config.EntityKey.*;

@Controller
public class MainController {

  @Autowired
  private CountryRepo countryRepo;
  @Autowired
  private CompanyRepo companyRepo;
  @Autowired
  private ProjectRepo projectRepo;
  @Autowired
  private BudgetRepo budgetRepo;
  @Autowired
  private SkillPaymentRepo skillPaymentRepo;

  @GetMapping("/greeting")
  public String greeting(@RequestParam(name = "user_name", required = false, defaultValue = "User!") String userName,
                         Model model) {
    model.addAttribute("user_name", userName);
    return "greeting";
  }

  @GetMapping("/")
  public String main(@AuthenticationPrincipal User user,
                     @RequestParam(required = false, defaultValue = "") String countryName,
                     Model model) {
    refreshTables(model);

    if (countryName != null && !countryName.isEmpty()) {
      model.addAttribute(COUNTRIES.getKey(), countryRepo.findByName(countryName));
    }
    model.addAttribute("countryName", countryName);
    model.addAttribute("user", user);

    return "main";
  }

  @PostMapping("add_country")
  public String addCountry(@AuthenticationPrincipal User user,
                           @RequestParam String name,
                           @RequestParam String currency,
                           Model model) {
    Country country = new Country(name, currency);
    countryRepo.save(country);
    refreshTables(model);
    return "main";
  }

  @PostMapping("calculate_budget")
  public String calculateBudget(@RequestParam String companyName,
                                @RequestParam String projectName,
                                @RequestParam String staffSkillLevel,
                                @RequestParam Integer staffNumber,
                                @RequestParam String startDate,
                                @RequestParam Integer monthsNumber,
                                Model model) {

    // TODO: move logic to some service

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    LocalDate startProjectDate = LocalDate.parse(startDate, formatter);
    LocalDate finishProjectDate = startProjectDate.plusMonths(monthsNumber);

    Company company = companyRepo.findByName(companyName).get(0);
    SkillPayment skillPayment = skillPaymentRepo.findByCountryNameAndSkillLevel(
        company.getCountryName(), staffSkillLevel)
        .get(0);

    BigDecimal monthlyPayment = skillPayment.getMonthlyPayment().multiply(new BigDecimal(staffNumber));
    BigDecimal totalPayment = monthlyPayment.multiply(new BigDecimal(monthsNumber));

    Country country = countryRepo.findByName(company.getCountryName()).get(0);
    String currency = country.getCurrency();

    Budget budget = new Budget(startProjectDate, finishProjectDate,
        monthsNumber, monthlyPayment, totalPayment, currency);
    Budget savedBudget = budgetRepo.save(budget);

    Project project = new Project(projectName, companyName, staffSkillLevel, staffNumber, savedBudget.getId());
    projectRepo.save(project);
    // TODO: move logic to some service

    refreshTables(model);
    return "main";
  }

  /**
   * Puts all the tables to the model containers.
   *
   * @param model
   */
  private void refreshTables(Model model) {
    model.addAttribute(COUNTRIES.getKey(), countryRepo.findAll());
    model.addAttribute(COMPANIES.getKey(), companyRepo.findAll());
    model.addAttribute(PROJECTS.getKey(), projectRepo.findAll());
    model.addAttribute(BUDGETS.getKey(), budgetRepo.findAll());
    model.addAttribute(SKILL_PAYMENTS.getKey(), skillPaymentRepo.findAll());
  }

}
