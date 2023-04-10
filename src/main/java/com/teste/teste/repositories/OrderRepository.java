package com.teste.teste.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teste.teste.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
