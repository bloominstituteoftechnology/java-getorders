package com.lambdaschool.readingorders.repositories;

import com.lambdaschool.readingorders.models.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrdersRepository extends CrudRepository<Order, Long> {
}
