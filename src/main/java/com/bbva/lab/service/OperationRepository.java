package com.bbva.lab.service;

import com.bbva.lab.models.Operation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

/**
 * Created by Administrador on 28/11/2017.
 */

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "operaciones", path = "operations")
public interface OperationRepository extends MongoRepository<Operation, String> {
}
