package com.springbootvue.api.user.repository;


import com.springbootvue.api.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by louchen on 2017/6/30.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long>,UserRepositoryCustom {

    User findByUsername(final String username);

}
