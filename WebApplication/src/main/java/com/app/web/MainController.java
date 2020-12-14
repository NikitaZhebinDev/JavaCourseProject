package com.app.web;

import com.app.web.db.entity.Country;
import com.app.web.db.repos.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

import static com.app.web.model.EntityKey.*;

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
  public String greeting(@RequestParam(name = "user_name", required = false, defaultValue = "World") String userName,
                         Map<String, Object> model) {
    model.put("user_name", userName);
    return "greeting";
  }

  @GetMapping("/")
  public String main(Map<String, Object> model) {
    putAllData(model);

    return "main";
  }

  @PostMapping("add_country")
  public String add(@RequestParam String name, @RequestParam String currency,
                    Map<String, Object> model) {
    Country country = new Country(name, currency);
    countryRepo.save(country);

    putAllData(model); // refresh the tables

    return "main";
  }

  @PostMapping("filter_country_by_name")
  public String filter(@RequestParam String name, Map<String, Object> model) {
    Iterable<Country> countries;
    if (name != null && !name.isEmpty()) {
      countries = countryRepo.findByName(name);
    } else {
      countries = countryRepo.findAll();
    }

    model.put("countries", countries);

    return "main";
  }

  /**
   * Puts all the tables to the model containers.
   *
   * @param model
   */
  private void putAllData(Map<String, Object> model) {
    model.put(COUNTRIES.getKey(), countryRepo.findAll());
    model.put(COMPANIES.getKey(), companyRepo.findAll());
    model.put(PROJECTS.getKey(), projectRepo.findAll());
    model.put(BUDGETS.getKey(), budgetRepo.findAll());
    model.put(SKILL_PAYMENTS.getKey(), skillPaymentRepo.findAll());
  }

}
