package com.app.web.repository;

import com.app.web.domain.Country;
import com.app.web.domain.SkillPayment;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * This will be AUTO IMPLEMENTED by Spring into a Bean called Skill Payment Repository
 * CRUD refers Create, Read, Update, Delete
 */
public interface SkillPaymentRepo extends CrudRepository<SkillPayment, Integer> {

  List<SkillPayment> findByCountryNameAndSkillLevel(String countryName, String skillLevel);

}
