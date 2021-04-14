package com.lambdaschool.readingorders.services;


import com.lambdaschool.readingorders.models.Customer;
import com.lambdaschool.readingorders.repositories.CustomersRepository;
import com.lambdaschool.readingorders.views.OrderCounts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;

@Transactional
@Service
public class CustomerServicesImpl implements CustomerServices {

  @Autowired
  private CustomersRepository custrepos;

  @Transactional
  @Override
  public Customer save(Customer customer) {
    return custrepos.save(customer);
  }

  @Override //JPA Query
  public List<Customer> findAllOrders() {
    List<Customer> list = new ArrayList<>();
    custrepos.findAll().iterator().forEachRemaining(list::add);
    return list;
  }

  @Override //JPA Query
  public Customer findCustomerById(long custcode) {
    return custrepos.findById(custcode)
        .orElseThrow(()-> new
            EntityNotFoundException("Customer " + custcode + " not found!"));
  }

  @Override //JPA Query
  public Customer findCustomerByCustname(String custname) {
    Customer rtnCustomer = custrepos.findByCustname(custname);
    return null;
  }

  @Override //JPA Query
  public List<Customer> findByCustnameLike(String subcustname) {
    List<Customer> customerList = custrepos
        .findByCustnameContainingIgnoringCase(subcustname);
    return customerList;
  }

  @Override //Custom SQL Query
  public List<OrderCounts> getOrderCounts() {
    List<OrderCounts> rtnList = custrepos.findOrderCounts();
    return rtnList;
  }
}
