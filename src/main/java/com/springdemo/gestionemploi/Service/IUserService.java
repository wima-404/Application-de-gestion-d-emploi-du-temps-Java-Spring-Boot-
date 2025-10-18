package com.springdemo.gestionemploi.Service;

import com.springdemo.gestionemploi.Entity.Role;
import org.springframework.security.core.userdetails.User;

import java.util.List;

public interface IUserService {
    List<User> getAllUsers();
    User getUserById(Long id);
    User saveUser(User user);
    User updateUser(Long id, User userDetails);
    void deleteUser(Long id);
    User findByLogin(String login);
    List<User> findUsersByRole(Role role);
}
