package com.lambdaschool.readingorders.services;

import com.lambdaschool.readingorders.models.Agent;

import java.util.List;

public interface AgentServices {
  Agent save(Agent agent);

  List<Agent> findAllAgents();

  Agent findAgentById(long id);
}
