package com.app.web.model;

/**
 * Contains Model Keys for the UI containers.
 */
public enum EntityKey {
  COUNTRIES("countries"),
  COMPANIES("companies"),
  PROJECTS("projects"),
  BUDGETS("budgets"),
  SKILL_PAYMENTS("skillPayments");

  private final String key;

  EntityKey(String key) {
    this.key = key;
  }

  public String getKey() {
    return key;
  }
}
