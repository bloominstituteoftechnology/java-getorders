package com.lambdaschool.readingorders.services;

import com.lambdaschool.readingorders.models.Agent;
import com.lambdaschool.readingorders.repositories.AgentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;

@Service
public class AgentServicesImpl implements AgentServices {

  @Autowired
  private AgentsRepository agentrepos;

  @Transactional
  @Override
  public Agent save(Agent agent) {
    return agentrepos.save(agent);
  }

  @Override //JPA Query
  public List<Agent> findAllAgents() {
    List<Agent> list = new ArrayList<>();
    agentrepos.findAll().iterator().forEachRemaining(list::add);
    return list;
  }

  @Override
  public Agent findAgentById(long id) {
    return agentrepos.findById(id)
        .orElseThrow(()-> new
            EntityNotFoundException("Agent " + id + " not found!"));
  }

}
