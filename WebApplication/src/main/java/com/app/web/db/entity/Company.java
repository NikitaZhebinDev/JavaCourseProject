package com.app.web.db.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

@Entity(name = "COMPANY")
public class Company {

  @Id
  private String name;

  //@Column(name = "country_name")
  private String countryName;

  //@Column(name = "current_budget")
  private BigDecimal currentBudget;

  //@Column(name = "allocated_budget")
  private BigDecimal allocatedBudget;

  //@Column(name = "foundation_date")
  private Date foundationDate;

}
