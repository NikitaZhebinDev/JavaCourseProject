package com.app.webapp.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity(name = "COMPANY")
public class Company {

  @Id
  private String name;
  private Integer staffNumber;

  public Company() {
  }

  public Company(String name, Integer staffNumber) {
    this.name = name;
    this.staffNumber = staffNumber;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getStaffNumber() {
    return staffNumber;
  }

  public void setStaffNumber(Integer staffNumber) {
    this.staffNumber = staffNumber;
  }

}
