package com.app.web;

import com.app.web.db.entity.Company;
import com.app.web.db.entity.Country;
import com.app.web.db.repos.CompanyRepo;
import com.app.web.db.repos.CountryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@Controller
public class MainController {

  @Autowired
  private CountryRepo countryRepo;

  @Autowired
  private CompanyRepo companyRepo;

  @GetMapping("/greeting")
  public String greeting(@RequestParam(name = "user_name", required = false, defaultValue = "World") String userName,
                         Map<String, Object> model) {
    model.put("user_name", userName);
    return "greeting";
  }

  @GetMapping("/")
  public String main(Map<String, Object> model) {
    Iterable<Country> countries = countryRepo.findAll();
    model.put("countries", countries);

    Iterable<Company> companies = companyRepo.findAll();
    model.put("companies", companies);

    return "main";
  }

  @PostMapping("add_country")
  public String add(@RequestParam String name, @RequestParam String currency,
                    Map<String, Object> model) {
    Country country = new Country(name, currency);
    countryRepo.save(country);

    Iterable<Country> countries = countryRepo.findAll();
    model.put("countries", countries);

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

}
