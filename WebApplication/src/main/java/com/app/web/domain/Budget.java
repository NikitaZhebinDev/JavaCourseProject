package com.app.web.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity(name = "BUDGET")
public class Budget {

  @Id
  private Integer id;
  private LocalDate startDate;
  private LocalDate finishDate;
  private Integer monthsNumber;
  private BigDecimal monthlyPayment;
  private BigDecimal totalPayment;
  private String currency;

  public Budget() {
  }

  public Budget(Integer id, LocalDate startDate, LocalDate finishDate, Integer monthsNumber, BigDecimal monthlyPayment, BigDecimal totalPayment, String currency) {
    this.id = id;
    this.startDate = startDate;
    this.finishDate = finishDate;
    this.monthsNumber = monthsNumber;
    this.monthlyPayment = monthlyPayment;
    this.totalPayment = totalPayment;
    this.currency = currency;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public LocalDate getStartDate() {
    return startDate;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public LocalDate getFinishDate() {
    return finishDate;
  }

  public void setFinishDate(LocalDate finishDate) {
    this.finishDate = finishDate;
  }

  public Integer getMonthsNumber() {
    return monthsNumber;
  }

  public void setMonthsNumber(Integer monthsNumber) {
    this.monthsNumber = monthsNumber;
  }

  public BigDecimal getMonthlyPayment() {
    return monthlyPayment;
  }

  public void setMonthlyPayment(BigDecimal monthlyPayment) {
    this.monthlyPayment = monthlyPayment;
  }

  public BigDecimal getTotalPayment() {
    return totalPayment;
  }

  public void setTotalPayment(BigDecimal totalPayment) {
    this.totalPayment = totalPayment;
  }

  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

}
