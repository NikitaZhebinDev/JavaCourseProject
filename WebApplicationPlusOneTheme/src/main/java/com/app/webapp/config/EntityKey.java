package com.app.webapp.config;

/**
 * Contains Model Keys for the UI containers.
 */
public enum EntityKey {
  EMPLOYEES("employees"),
  COMPANIES("companies"),
  CURRENCY("currencies"),
  CODEX("codex"),
  PAYMENTS("payments");

  private final String key;

  EntityKey(String key) {
    this.key = key;
  }

  public String getKey() {
    return key;
  }
}
