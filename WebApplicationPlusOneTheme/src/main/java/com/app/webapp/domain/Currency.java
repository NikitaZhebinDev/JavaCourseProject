package com.app.webapp.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "CURRENCY")
public class Currency {

  @Id
  private String countryName;
  private String currency;

  public Currency() {
  }

  public Currency(String countryName, String currency) {
    this.countryName = countryName;
    this.currency = currency;
  }

  public String getCountryName() {
    return countryName;
  }

  public void setCountryName(String countryName) {
    this.countryName = countryName;
  }

  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

}
