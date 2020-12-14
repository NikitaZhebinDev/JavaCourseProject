package com.app.web.db.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity(name = "SKILL_PAYMENT")
public class SkillPayment {

  @Id
  private Integer id;
  private String countryName;
  private String skillLevel;
  private BigDecimal monthlyPayment;

  public SkillPayment() {
  }

  public SkillPayment(Integer id, String countryName, String skillLevel, BigDecimal monthlyPayment) {
    this.id = id;
    this.countryName = countryName;
    this.skillLevel = skillLevel;
    this.monthlyPayment = monthlyPayment;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getCountryName() {
    return countryName;
  }

  public void setCountryName(String countryName) {
    this.countryName = countryName;
  }

  public String getSkillLevel() {
    return skillLevel;
  }

  public void setSkillLevel(String skillLevel) {
    this.skillLevel = skillLevel;
  }

  public BigDecimal getMonthlyPayment() {
    return monthlyPayment;
  }

  public void setMonthlyPayment(BigDecimal monthlyPayment) {
    this.monthlyPayment = monthlyPayment;
  }

}
