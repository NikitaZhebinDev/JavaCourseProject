package com.app.web.repository;

import com.app.web.domain.Budget;
import org.springframework.data.repository.CrudRepository;

/**
 * This will be AUTO IMPLEMENTED by Spring into a Bean called Budget Repository
 * CRUD refers Create, Read, Update, Delete
 */
public interface BudgetRepo extends CrudRepository<Budget, Integer> {
}
