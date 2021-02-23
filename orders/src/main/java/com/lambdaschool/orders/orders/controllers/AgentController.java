package com.lambdaschool.orders.orders.controllers;

import com.lambdaschool.orders.orders.models.Agent;
import com.lambdaschool.orders.orders.services.AgentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/agents")
public class AgentController {
    @Autowired
    AgentsService agentsService;

    //    http://localhost:2019/agents/agent/9
    @GetMapping(value = "agent/{agentid}", produces = {"application/json"})
    public ResponseEntity<?> findAgentId(@PathVariable long agentid)
    {
        Agent rtnAgent = agentsService.findAgentById(agentid);
        return new ResponseEntity<>(rtnAgent, HttpStatus.OK);
    }
}
