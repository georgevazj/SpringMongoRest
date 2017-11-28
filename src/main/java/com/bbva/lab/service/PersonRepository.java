package com.bbva.lab.service;

import com.bbva.lab.models.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

/**
 * Created by jorge on 22/12/2016.
 */

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "personas", path = "people")
public interface PersonRepository extends MongoRepository<Person, String> {

    Person findById(@Param("id") String id);
    Person findByDataPan(@Param("pan") String pan);
    Person findByDataCellPhone(@Param("cellphone") String cellphone);
    Person findByDataName(@Param("name") String name);

}
