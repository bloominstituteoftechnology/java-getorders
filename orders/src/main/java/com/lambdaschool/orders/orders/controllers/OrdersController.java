package com.lambdaschool.orders.orders.controllers;

import com.lambdaschool.orders.orders.models.Order;
import com.lambdaschool.orders.orders.services.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrdersController {
    @Autowired
    OrdersService ordersService;

//    http://localhost:2019/orders/order/7
@GetMapping(value = "/order/{ordernum}", produces = {"application/json"})
public ResponseEntity<?> getOrderByNumber(@PathVariable long ordernum)
{
    Order rtnOrder = ordersService.findOrdersById(ordernum);
    return new ResponseEntity<>(rtnOrder, HttpStatus.OK);
}
}
