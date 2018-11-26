package com.travonect.api.repository;

import com.travonect.api.model.user.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String>{
    
    public User findOneByEmail(String email);
    
}
