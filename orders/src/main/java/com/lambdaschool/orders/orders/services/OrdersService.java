package com.lambdaschool.orders.orders.services;

import com.lambdaschool.orders.orders.models.Agent;
import com.lambdaschool.orders.orders.models.Order;

import java.util.List;

public interface OrdersService {
    Order save(Order order);

    Order findOrdersById(long id);

}
