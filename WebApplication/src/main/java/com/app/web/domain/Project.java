package com.app.web.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "PROJECT")
public class Project {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private String name;
  private String companyName;
  private String staffSkillLevel;
  private Integer staffNumber;
  private Integer budgetId;

  public Project() {
  }

  public Project(String name, String companyName, String staffSkillLevel, Integer staffNumber, Integer budgetId) {
    this.name = name;
    this.companyName = companyName;
    this.staffSkillLevel = staffSkillLevel;
    this.staffNumber = staffNumber;
    this.budgetId = budgetId;
  }

  public Project(Integer id, String name, String companyName, String staffSkillLevel, Integer staffNumber, Integer budgetId) {
    this.id = id;
    this.name = name;
    this.companyName = companyName;
    this.staffSkillLevel = staffSkillLevel;
    this.staffNumber = staffNumber;
    this.budgetId = budgetId;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public String getStaffSkillLevel() {
    return staffSkillLevel;
  }

  public void setStaffSkillLevel(String staffSkillLevel) {
    this.staffSkillLevel = staffSkillLevel;
  }

  public Integer getStaffNumber() {
    return staffNumber;
  }

  public void setStaffNumber(Integer staffNumber) {
    this.staffNumber = staffNumber;
  }

  public Integer getBudgetId() {
    return budgetId;
  }

  public void setBudgetId(Integer budgetId) {
    this.budgetId = budgetId;
  }

}
