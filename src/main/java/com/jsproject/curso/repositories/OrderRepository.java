package com.jsproject.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsproject.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
