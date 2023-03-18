package com.vitin.catalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vitin.catalog.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
}
