package com.teste.teste.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teste.teste.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
