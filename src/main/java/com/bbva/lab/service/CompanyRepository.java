package com.bbva.lab.service;

import com.bbva.lab.models.Company;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by Administrador on 28/11/2017.
 */

@RepositoryRestResource(collectionResourceRel = "empresas", path = "companies")
public interface CompanyRepository extends MongoRepository<Company, String>{

    Company findById(@Param("id") String id);
    Company findByDataCompany(@Param("company") String company);
    Company findByDataName(@Param("name") String name);

}
