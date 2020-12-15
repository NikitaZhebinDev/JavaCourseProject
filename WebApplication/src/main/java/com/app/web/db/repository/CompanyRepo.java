package com.app.web.db.repository;

import com.app.web.db.entity.Company;
import org.springframework.data.repository.CrudRepository;

/**
 * This will be AUTO IMPLEMENTED by Spring into a Bean called Company Repository
 * CRUD refers Create, Read, Update, Delete
 */
public interface CompanyRepo extends CrudRepository<Company, Integer> {
}
