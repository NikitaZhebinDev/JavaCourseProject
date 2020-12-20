package com.app.webapp.repository;

import com.app.webapp.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * This will be AUTO IMPLEMENTED by Spring into a Bean called User Repository
 * CRUD refers Create, Read, Update, Delete
 */
public interface UserRepo extends JpaRepository<User, Integer> {
  User findByUsername(String username);
}
