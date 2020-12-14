package com.app.web.db.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity(name = "COMPANY")
public class Company {

  @Id
  private String name;
  private String countryName;
  private BigDecimal currentBudget;
  private BigDecimal allocatedBudget;
  private LocalDate foundationDate;

  public Company() {
  }

  public Company(String name, String countryName, BigDecimal currentBudget, BigDecimal allocatedBudget, LocalDate foundationDate) {
    this.name = name;
    this.countryName = countryName;
    this.currentBudget = currentBudget;
    this.allocatedBudget = allocatedBudget;
    this.foundationDate = foundationDate;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCountryName() {
    return countryName;
  }

  public void setCountryName(String countryName) {
    this.countryName = countryName;
  }

  public BigDecimal getCurrentBudget() {
    return currentBudget;
  }

  public void setCurrentBudget(BigDecimal currentBudget) {
    this.currentBudget = currentBudget;
  }

  public BigDecimal getAllocatedBudget() {
    return allocatedBudget;
  }

  public void setAllocatedBudget(BigDecimal allocatedBudget) {
    this.allocatedBudget = allocatedBudget;
  }

  public LocalDate getFoundationDate() {
    return foundationDate;
  }

  public void setFoundationDate(LocalDate foundationDate) {
    this.foundationDate = foundationDate;
  }

}
