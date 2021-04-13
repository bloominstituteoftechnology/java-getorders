package com.lambdaschool.javaorders.controllers;

import com.lambdaschool.javaorders.models.Customer;
import com.lambdaschool.javaorders.services.CustomerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerServices customerServices;

    @GetMapping(value = "/orders", produces = "application/json")
    public ResponseEntity<?> findAllOrders(){
        List<Customer> rtnList = customerServices.findAllOrders();
        return new ResponseEntity<>(rtnList, HttpStatus.OK);
    }

    @GetMapping(value = "/customer/{custcode}", produces = "application/json")
    public ResponseEntity<?> findCustomerById(@PathVariable long custcode){
        Customer rtnCust = customerServices.findCustomerById(custcode);
        return new ResponseEntity<>(rtnCust, HttpStatus.OK);
    }

    @GetMapping(value = "/namelike/{subname}", produces = "application/json")
    public ResponseEntity<?> findCustomersLikeName(@PathVariable String subname){
        List<Customer> rtnList = customerServices.findByNameLike(subname);
        return new ResponseEntity<>(rtnList, HttpStatus.OK);
    }

}
