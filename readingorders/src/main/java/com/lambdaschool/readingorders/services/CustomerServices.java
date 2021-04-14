package com.lambdaschool.readingorders.services;


import com.lambdaschool.readingorders.models.Customer;
import com.lambdaschool.readingorders.views.OrderCounts;

import java.util.List;


public interface CustomerServices {

  Customer save(Customer customer);

  List<Customer> findAllOrders();

  Customer findCustomerById(long custcode);

//  List<Customer> findAllCustomers();

  Customer findCustomerByCustname(String custname);

  List<Customer> findByCustnameLike(String subcustname);

  List<OrderCounts> getOrderCounts();

}
