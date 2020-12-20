package com.app.webapp.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity(name = "PAYMENT")
public class Payment {

  @Id
  private Integer id;
  private Integer employeeId;
  private String countryName;
  private BigDecimal payment;

  public Payment() {
  }

  public Payment(Integer employeeId, String countryName, BigDecimal payment) {
    this.employeeId = employeeId;
    this.countryName = countryName;
    this.payment = payment;
  }

  public Payment(Integer id, Integer employeeId, String countryName, BigDecimal payment) {
    this.id = id;
    this.employeeId = employeeId;
    this.countryName = countryName;
    this.payment = payment;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getEmployeeId() {
    return employeeId;
  }

  public void setEmployeeId(Integer employeeId) {
    this.employeeId = employeeId;
  }

  public String getCountryName() {
    return countryName;
  }

  public void setCountryName(String countryName) {
    this.countryName = countryName;
  }

  public BigDecimal getPayment() {
    return payment;
  }

  public void setPayment(BigDecimal payment) {
    this.payment = payment;
  }

}
