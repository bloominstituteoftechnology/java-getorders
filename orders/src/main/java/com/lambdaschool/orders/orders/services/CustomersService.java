package com.lambdaschool.orders.orders.services;

import com.lambdaschool.orders.orders.models.Agent;
import com.lambdaschool.orders.orders.models.Customer;

import java.util.List;

public interface CustomersService {


    // /customers/orders
    List<Customer> findAllCustomerOrders();

//    Customer save(Customer customer);

    // /customers/customer/{id}
    Customer findCustomersById(long id);

    // /customers/namelike/{likename}
    List<Customer> findCustomerLikeName(String likeName);


}
