package com.example.project.service;

import com.example.project.model.dto.request.ProductRequest;
import com.example.project.model.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Set;

public interface IProductService {
    Product saveOrUpdate(ProductRequest productRequest);
    Product findById(Long id);
    void deleteById(Long id);
    Page<Product> paginate(Pageable pageable);
    Set<Product> findByName(String name);
}
