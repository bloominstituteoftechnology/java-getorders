package com.lambdaschool.orders.orders.repositories;

import com.lambdaschool.orders.orders.models.Agent;
import com.lambdaschool.orders.orders.models.Order;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrdersRepository extends CrudRepository<Order, Long>{

}
