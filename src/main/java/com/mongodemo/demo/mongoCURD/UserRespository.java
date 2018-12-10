package com.mongodemo.demo.mongoCURD;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRespository extends MongoRepository<User,String> {

    User findByUserName(String name);

}
