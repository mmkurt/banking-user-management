package com.mkbank.user.query.api.repository;

import com.mkbank.user.core.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface UserRepository extends MongoRepository<User, String> {

    @Query("{'$or' : [{'firstname': {$regex : ?0, $options: '1'}}, " +
            "{'lastName': {$regex : ?0, $options: '1'}}, " +
            "{'email': {$regex : ?0, $options: '1'}}, " +
            "{'account.userName': {$regex : ?0, $options: '1' }} ]}")
    List<User> findByFilterRegex(String filter);
}
