package com.app.webapp.repository;

import com.app.webapp.domain.Company;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * This will be AUTO IMPLEMENTED by Spring into a Bean called Company Repository
 * CRUD refers Create, Read, Update, Delete
 */
public interface CompanyRepo extends CrudRepository<Company, String> {

  List<Company> findByName(String name);

}
