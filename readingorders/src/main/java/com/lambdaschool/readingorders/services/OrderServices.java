package com.lambdaschool.readingorders.services;

import com.lambdaschool.readingorders.models.Order;

import java.util.List;

public interface OrderServices {

  List<Order> findAllOrders();

  Order findOrderById(long id);
}
