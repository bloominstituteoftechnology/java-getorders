package com.lambdaschool.getorders.services;

import com.lambdaschool.getorders.models.Order;

import java.util.List;

public interface OrderServices {

    List findAllOrders();

    Order findOrderById(long id);
}
