package com.app.webapp.repository;

import com.app.webapp.domain.Codex;
import org.springframework.data.repository.CrudRepository;

/**
 * This will be AUTO IMPLEMENTED by Spring into a Bean called Codex Repository
 * CRUD refers Create, Read, Update, Delete
 */
public interface CodexRepo extends CrudRepository<Codex, String> {
}
