package com.app.webapp.repository;

import com.app.webapp.domain.Payment;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * This will be AUTO IMPLEMENTED by Spring into a Bean called Payment Repository
 * CRUD refers Create, Read, Update, Delete
 */
public interface PaymentRepo extends CrudRepository<Payment, Integer> {

  List<Payment> findByEmployeeId(Integer employeeId);

}
