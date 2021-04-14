package com.lambdaschool.getorders.services;

import com.lambdaschool.getorders.models.Agent;
import com.lambdaschool.getorders.repositories.AgentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;

@Transactional
@Service(value = "agentservices")
public class AgentServicesImpl implements AgentServices{
    @Autowired
    private AgentRepository agentrepos;




    @Override
    public Agent findAgentById(long id) throws EntityNotFoundException {
        return agentrepos.findById(id)
                .orElseThrow(()-> new EntityNotFoundException("agent" +id + "not found"));


    }
}
