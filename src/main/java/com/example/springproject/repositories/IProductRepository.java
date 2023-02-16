package com.example.springproject.repositories;

import com.example.springproject.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IProductRepository extends JpaRepository<Product, Integer> {
    List<Product> findByTitle(String title);
}
