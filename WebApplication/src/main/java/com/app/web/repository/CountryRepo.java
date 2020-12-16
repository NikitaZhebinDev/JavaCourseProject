package com.app.web.repository;

import com.app.web.domain.Country;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * This will be AUTO IMPLEMENTED by Spring into a Bean called Country Repository
 * CRUD refers Create, Read, Update, Delete
 */
public interface CountryRepo extends CrudRepository<Country, Integer> {

  List<Country> findByName(String name);

}
