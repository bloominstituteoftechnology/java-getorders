package com.javagetorders.services;

import com.javagetorders.models.Agent;
import com.javagetorders.repositories.AgentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;

@Transactional
@Service(value = "agentsService")
public class AgentServiceImpl
    implements AgentService
{
    @Autowired
    private AgentRepository agentsrepos;

    @Override
    public Agent findAgentById(long id) throws
                                        EntityNotFoundException
    {
        return agentsrepos.findById(id)
            .orElseThrow(() -> new EntityNotFoundException("Agent Id " + id + " Not Found"));
    }
}
