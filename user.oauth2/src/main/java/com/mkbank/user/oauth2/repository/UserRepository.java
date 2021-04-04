package com.mkbank.user.oauth2.repository;

import com.mkbank.user.core.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Optional;

public interface UserRepository extends MongoRepository<User,String> {

    @Query("{'account.username': ?0}")
    Optional<User> findByUserName(String username);
}
