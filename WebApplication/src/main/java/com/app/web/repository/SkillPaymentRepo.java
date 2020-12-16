package com.app.web.repository;

import com.app.web.domain.SkillPayment;
import org.springframework.data.repository.CrudRepository;

/**
 * This will be AUTO IMPLEMENTED by Spring into a Bean called Skill Payment Repository
 * CRUD refers Create, Read, Update, Delete
 */
public interface SkillPaymentRepo extends CrudRepository<SkillPayment, Integer> {
}
