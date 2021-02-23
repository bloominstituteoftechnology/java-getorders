package com.lambdaschool.orders.orders.controllers;

import com.lambdaschool.orders.orders.models.Customer;
import com.lambdaschool.orders.orders.services.CustomersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomersController {

    @Autowired
    private CustomersService customerService;
//    http://localhost:2019/customers/orders
    @GetMapping(value = "/orders", produces = {"application/json"})
    public ResponseEntity<?> listAllCustomers()
    {
        List<Customer> rtnList = customerService.findAllCustomerOrders();
        return new ResponseEntity<>(rtnList, HttpStatus.OK);
    }

    // /customers/customer/{id}
    @GetMapping(value = "/customer/{custid}", produces = {"application/json"})
    public ResponseEntity<?> findCustomerId(@PathVariable long custid)
    {
        Customer rtnCust = customerService.findCustomersById(custid);
        return new ResponseEntity<>(rtnCust, HttpStatus.OK);
    }

    // /customers/namelike/{likename}
    @GetMapping(value = "/namelike/{likename}", produces = {"application/json"})
    public ResponseEntity<?> findByLikeName(@PathVariable String likename)
    {
        List<Customer> rtnList = customerService.findCustomerLikeName(likename);
        return new ResponseEntity<>(rtnList, HttpStatus.OK);
    }
}
