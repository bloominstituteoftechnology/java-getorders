package com.javagetorders.services;

import com.javagetorders.models.Order;

import java.util.List;

public interface OrdersServices
{

    List<Order> findOrdersWithAdvanceAmount();

    /**
     * Returns the order with the given primary key.
     *
     * @param id The primary key (long) of the order you seek.
     * @return The given order or throws an exception if not found.
     */
    Order findOrdersById(long id);
}
