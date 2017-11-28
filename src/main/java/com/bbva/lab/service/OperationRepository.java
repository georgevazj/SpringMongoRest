package com.bbva.lab.service;

import com.bbva.lab.models.Operation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by Administrador on 28/11/2017.
 */

@RepositoryRestResource(collectionResourceRel = "operaciones", path = "operations")
public interface OperationRepository extends MongoRepository<Operation, String> {
}
