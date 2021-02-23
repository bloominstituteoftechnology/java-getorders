package com.lambdaschool.orders.orders.repositories;

import com.lambdaschool.orders.orders.models.Agent;
import org.springframework.data.repository.CrudRepository;

public interface AgentsRepository extends CrudRepository<Agent, Long> {

}
