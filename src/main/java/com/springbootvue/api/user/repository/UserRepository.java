package com.springbootvue.api.user.repository;


import com.springbootvue.api.user.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by louchen on 2017/6/30.
 */
@Repository
public interface UserRepository extends MongoRepository<User, String>,UserRepositoryCustom {

    User findByName(final String name);

}
