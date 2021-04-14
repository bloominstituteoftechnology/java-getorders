package com.lambdaschool.readingorders.services;

import com.lambdaschool.readingorders.models.Payment;
import com.lambdaschool.readingorders.repositories.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class PaymentServicesImpl implements PaymentServices {

  @Autowired
  PaymentRepository paymentrepos;

  @Transactional
  @Override
  public Payment save(Payment payment) {
    return paymentrepos.save(payment);
  }
}
