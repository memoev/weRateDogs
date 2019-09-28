package com.example.weRateDogs;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CRUD extends CrudRepository<Doggos, Long>{

}
