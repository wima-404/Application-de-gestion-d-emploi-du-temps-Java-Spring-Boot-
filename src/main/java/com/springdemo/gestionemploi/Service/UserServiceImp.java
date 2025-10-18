package com.springdemo.gestionemploi.Service;

import com.springdemo.gestionemploi.Entity.Role;
import com.springdemo.gestionemploi.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class UserServiceImp implements IUserService {


    @Autowired
    private UserRepository userRepository;

    @Autowired(required = false)
    private PasswordEncoder passwordEncoder;



    @Override
    public List<User> getAllUsers() {
        return List.of();
    }

    @Override
    public User getUserById(Long id) {
        return null;
    }

    @Override
    public User saveUser(User user) {
        return null;
    }

    @Override
    public User updateUser(Long id, User userDetails) {
        return null;
    }

    @Override
    public void deleteUser(Long id) {

    }

    @Override
    public User findByLogin(String login) {
        return null;
    }

    @Override
    public List<User> findUsersByRole(Role role) {
        return List.of();
    }
}
