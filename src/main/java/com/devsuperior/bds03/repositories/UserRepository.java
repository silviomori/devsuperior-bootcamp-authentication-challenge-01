package com.devsuperior.bds03.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

import com.devsuperior.bds03.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	UserDetails findByEmail(String username);

}
