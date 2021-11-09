package com.javagetorders.repositories;

import com.javagetorders.models.Customer;
import com.javagetorders.repositories.CustomerRepository;
import org.springframework.data.repository.CrudRepository;

/**
 * The CRUD Repository connecting Customer to rest of the application.
 */
public interface CustomerRepository
    extends CrudRepository<Customer, Long>
{
}

