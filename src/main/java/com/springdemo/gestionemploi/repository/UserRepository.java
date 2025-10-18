package com.springdemo.gestionemploi.repository;

import com.springdemo.gestionemploi.Entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User , Long> {
    Optional<User> findByLogin(String login) ;

    //Boolean existsByLogin(String login);

    List<User> findByRole(Role role);


}
