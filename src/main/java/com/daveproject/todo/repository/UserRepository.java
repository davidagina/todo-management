package com.daveproject.todo.repository;

import com.daveproject.todo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByUsername(String username);
    Boolean existByEmail(String email);

    Optional<User> findByUsernameOrEmail(String username, String email);
}
