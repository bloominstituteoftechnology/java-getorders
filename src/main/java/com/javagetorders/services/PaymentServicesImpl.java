package com.javagetorders.services;

import com.javagetorders.repositories.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Transactional
@Service(value = "paymentService")
public class PaymentServicesImpl
    implements PaymentServices
{
    @Autowired
    PaymentRepository paymentrepos;
}