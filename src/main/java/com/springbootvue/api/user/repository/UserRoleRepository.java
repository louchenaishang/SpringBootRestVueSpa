package com.springbootvue.api.user.repository;

import com.springbootvue.api.role.model.Role;
import com.springbootvue.api.user.model.User;
import com.springbootvue.api.user.model.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRoleRepository extends JpaRepository<UserRole, Long>,UserRoleRepositoryCustom {

    List<UserRole> findByUser(final User user);

    List<UserRole> findByRole(final Role role);

}
