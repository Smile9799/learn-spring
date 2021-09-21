package com.eve_coding.spring.security.repository;

import com.eve_coding.spring.security.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

    User findByUsername(String username);
}
