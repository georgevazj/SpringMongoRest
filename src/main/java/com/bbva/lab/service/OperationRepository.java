package com.bbva.lab.service;

import com.bbva.lab.models.Operation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

/**
 * Created by Administrador on 28/11/2017.
 */

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "operaciones", path = "operations")
public interface OperationRepository extends MongoRepository<Operation, String> {

    //TODO - Busqueda por pan y details combinado y otro simple por Company
    Operation findByDataCompany(@Param("company") String company);
    List<Operation> findByDataPanAndDataDetails(@Param("pan") String pan, @Param("details") String details);
}
