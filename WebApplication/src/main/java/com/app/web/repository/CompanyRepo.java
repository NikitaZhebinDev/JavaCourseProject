package com.app.web.repository;

import com.app.web.domain.Company;
import com.app.web.domain.Country;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * This will be AUTO IMPLEMENTED by Spring into a Bean called Company Repository
 * CRUD refers Create, Read, Update, Delete
 */
public interface CompanyRepo extends CrudRepository<Company, Integer> {

  List<Company> findByName(String name);

}
