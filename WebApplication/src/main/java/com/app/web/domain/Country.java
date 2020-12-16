package com.app.web.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "COUNTRY")
public class Country {

  @Id
  private String name;
  private String currency;

  public Country() {
  }

  public Country(String name, String currency) {
    this.name = name;
    this.currency = currency;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

}
