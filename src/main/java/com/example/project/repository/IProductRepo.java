package com.example.project.repository;

import com.example.project.model.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IProductRepo extends JpaRepository<Product, Long> {
    List<Product> findProductByProductName(String name);
}
