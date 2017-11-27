package com.bbva.lab.service;

import com.bbva.lab.models.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Created by jorge on 22/12/2016.
 */

@RepositoryRestResource(collectionResourceRel = "personas", path = "people")
public interface PersonRepository extends MongoRepository<Person, String> {

    List<Person> findById(@Param("id") String id);
    List<Person> findByDataPan(@Param("pan") String pan);

}
