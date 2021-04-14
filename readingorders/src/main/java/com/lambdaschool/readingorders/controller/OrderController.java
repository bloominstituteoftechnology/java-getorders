package com.lambdaschool.readingorders.controller;//package com.lambdaschool.modelorders.controller;
//
import com.lambdaschool.readingorders.models.Order;
import com.lambdaschool.readingorders.services.OrderServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

//
@RestController
@RequestMapping("/orders")
public class OrderController {

  @Autowired
  private OrderServices orderServices;

//  http://localhost:2019/orders/order/7
  @GetMapping(value = "/order/{orderid}",
      produces = "application/json")
  public ResponseEntity<?> findOrderById(
      @PathVariable long orderid) {
    Order rtnOrder = orderServices.findOrderById(orderid);
    return new ResponseEntity<>(rtnOrder,
                                HttpStatus.OK);
  }
}

