package com.app.web.db.repository;

import com.app.web.db.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

/**
 * This will be AUTO IMPLEMENTED by Spring into a Bean called User Repository
 * CRUD refers Create, Read, Update, Delete
 */
public interface UserRepo extends JpaRepository<User, Integer> {
  User findByUsername(String username);
}
