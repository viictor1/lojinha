package com.vitin.catalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vitin.catalog.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
}
