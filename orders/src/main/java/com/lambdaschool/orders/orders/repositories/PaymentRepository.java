package com.lambdaschool.orders.orders.repositories;

import com.lambdaschool.orders.orders.models.Payment;
import org.springframework.data.repository.CrudRepository;

public interface PaymentRepository extends CrudRepository<Payment, Long> {

}
