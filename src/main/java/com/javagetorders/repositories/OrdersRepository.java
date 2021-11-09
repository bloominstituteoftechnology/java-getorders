package com.javagetorders.repositories;

import com.javagetorders.Order;
import org.springframework.data.repository.CrudRepository;

/**
 * The CRUD Repository connecting Order to rest of the application.
 */
public interface OrdersRepository
    extends CrudRepository<Order, Long>
{
}

