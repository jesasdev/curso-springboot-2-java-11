package com.jsproject.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsproject.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
