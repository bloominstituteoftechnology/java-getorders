package com.lambdaschool.readingorders.controller;//package com.lambdaschool.modelorders.controller;

import com.lambdaschool.readingorders.models.Customer;
import com.lambdaschool.readingorders.services.CustomerServices;
import com.lambdaschool.readingorders.views.OrderCounts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

  @Autowired
  private CustomerServices customerServices;

//  http://localhost:2019/customers/orders
  @GetMapping(value = "/orders",
      produces = "application/json")
  public ResponseEntity<?> listAllOrders(){
    List<Customer> rtnList = customerServices.findAllOrders();
    return new ResponseEntity<>(rtnList, HttpStatus.OK);
  }

//  http://localhost:2019/customers/customer/7
//  http://localhost:2019/customers/customer/77
  @GetMapping(value = "/customer/{custid}",
      produces = "application/json")
  public ResponseEntity<?> findCustomerById(
      @PathVariable long custid){
    Customer rtnCust = customerServices.findCustomerById(custid);
    return new ResponseEntity<>(rtnCust, HttpStatus.OK);
}

//  http://localhost:2019/customers/namelike/mes
//  http://localhost:2019/customers/namelike/cin
  @GetMapping(value = "namelike/{subcustname}",
      produces = "application/json")
  public ResponseEntity<?> findCustomerByCustname(@PathVariable String subcustname){
    List<Customer> rtnList = customerServices.findByCustnameLike(subcustname);
    return new ResponseEntity<>(rtnList, HttpStatus.OK);
  }

  //http://localhost:2019/customers/orders/count
  @GetMapping(value = "/orders/counts", produces = "application/json")
  public ResponseEntity<?> getOrderCounts(){
    List<OrderCounts> rtnList = customerServices.getOrderCounts();
    return new ResponseEntity<>(rtnList, HttpStatus.OK);
  }
}

