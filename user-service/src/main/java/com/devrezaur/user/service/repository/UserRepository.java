package com.devrezaur.user.service.repository;

import com.devrezaur.user.service.model.Role;
import com.devrezaur.user.service.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<User, UUID> {

    User findByUserId(UUID userId);

    List<User> findByRole(Role role);

    User findByEmail(String email);
}
