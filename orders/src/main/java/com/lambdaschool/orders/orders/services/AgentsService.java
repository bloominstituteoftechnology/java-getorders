package com.lambdaschool.orders.orders.services;

import com.lambdaschool.orders.orders.models.Agent;

import java.util.List;

public interface AgentsService {
    Agent save(Agent agent);

    Agent findAgentById(long id);
}
