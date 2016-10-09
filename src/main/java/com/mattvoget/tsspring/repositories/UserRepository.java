package com.mattvoget.tsspring.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.mattvoget.tsspring.models.User;

@RepositoryRestResource(collectionResourceRel = "user", path = "user")
public interface UserRepository extends MongoRepository<User, String>, UserRepositoryCustom {
	User findByUsername(String username);
}
