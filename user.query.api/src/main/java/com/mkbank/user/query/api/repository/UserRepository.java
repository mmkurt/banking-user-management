package com.mkbank.user.query.api.repository;

import com.mkbank.user.core.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String > {
}
