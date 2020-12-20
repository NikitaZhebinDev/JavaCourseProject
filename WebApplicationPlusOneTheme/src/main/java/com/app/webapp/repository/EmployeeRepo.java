package com.app.webapp.repository;

import com.app.webapp.domain.Employee;
import org.springframework.data.repository.CrudRepository;

/**
 * This will be AUTO IMPLEMENTED by Spring into a Bean called Employee Repository
 * CRUD refers Create, Read, Update, Delete
 */
public interface EmployeeRepo extends CrudRepository<Employee, Integer> {
}
