package com.eve_coding.spring.security.service;

import com.eve_coding.spring.security.model.Role;
import com.eve_coding.spring.security.model.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String username,String roleName);
    User getUser(String username);
    List<User> getUsers();
}
