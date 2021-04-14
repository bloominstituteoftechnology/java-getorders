package com.lambdaschool.getorders.services;

import com.lambdaschool.getorders.models.Customer;

import java.util.List;

public interface CustomerServices {

    List<Customer> findByNameLike(String thename);

    Customer findCustomerById(long id);

    List<Customer> findAllCustomers();
}
