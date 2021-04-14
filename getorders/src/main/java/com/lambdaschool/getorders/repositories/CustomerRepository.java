package com.lambdaschool.getorders.repositories;

import com.lambdaschool.getorders.models.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerRepository extends CrudRepository<Customer,Long> {


    List<Customer> findByCustnameContainingIgnoringCase(String thename);
}
