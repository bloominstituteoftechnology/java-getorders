package com.javagetorders.repositories;

import com.javagetorders.models.Agent;
import org.springframework.data.repository.CrudRepository;

/**
 * The CRUD Repository connecting Agent to rest of the application.
 */
public interface AgentsRepository
    extends CrudRepository<Agent, Long>
{
}
