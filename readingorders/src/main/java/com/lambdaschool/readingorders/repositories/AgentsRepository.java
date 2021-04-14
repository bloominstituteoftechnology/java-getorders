package com.lambdaschool.readingorders.repositories;

import com.lambdaschool.readingorders.models.Agent;
import org.springframework.data.repository.CrudRepository;

public interface AgentsRepository extends CrudRepository<Agent, Long> {

}
