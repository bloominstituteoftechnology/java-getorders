package com.lambdaschool.readingorders.repositories;

import com.lambdaschool.readingorders.models.Payment;
import org.springframework.data.repository.CrudRepository;

public interface PaymentRepository extends CrudRepository<Payment, Long> {
}
