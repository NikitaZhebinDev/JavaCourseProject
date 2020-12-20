package com.app.webapp.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "CODEX")
public class Codex {

  @Id
  private String jobPosition;
  private String link;

  public Codex() {
  }

  public Codex(String jobPosition, String link) {
    this.jobPosition = jobPosition;
    this.link = link;
  }

  public String getJobPosition() {
    return jobPosition;
  }

  public void setJobPosition(String jobPosition) {
    this.jobPosition = jobPosition;
  }

  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

}
