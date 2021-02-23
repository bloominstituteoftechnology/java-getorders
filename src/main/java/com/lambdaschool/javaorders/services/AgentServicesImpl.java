package com.lambdaschool.javaorders.services;

import com.lambdaschool.javaorders.models.Agent;
import com.lambdaschool.javaorders.repositories.AgentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;

@Transactional
@Service(value = "agentServices")
public class AgentServicesImpl implements AgentServices
{
    @Autowired
    private AgentsRepository agentrepos;

    @Override
    public Agent findByAgentCode(long id)
    {
        return agentrepos.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("Agent " + id + " Not Found!"));
    }
}
