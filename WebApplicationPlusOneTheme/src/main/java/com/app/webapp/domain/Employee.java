package com.app.webapp.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "EMPLOYEE")
public class Employee {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private String companyName;
  private String name;
  private String jobPosition;

  public Employee() {
  }

  public Employee(String companyName, String name, String jobPosition) {
    this.companyName = companyName;
    this.name = name;
    this.jobPosition = jobPosition;
  }

  public Employee(Integer id, String companyName, String name, String jobPosition) {
    this.id = id;
    this.companyName = companyName;
    this.name = name;
    this.jobPosition = jobPosition;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getJobPosition() {
    return jobPosition;
  }

  public void setJobPosition(String jobPosition) {
    this.jobPosition = jobPosition;
  }

}
