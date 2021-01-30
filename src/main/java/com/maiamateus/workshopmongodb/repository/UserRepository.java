package com.maiamateus.workshopmongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.maiamateus.workshopmongodb.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
