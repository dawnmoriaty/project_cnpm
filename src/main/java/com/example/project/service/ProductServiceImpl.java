package com.example.project.service;

import com.example.project.model.entity.Product;
import com.example.project.repository.IProductRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements IProductService{
    private final IProductRepo productRepo;
    @Override
    public List<Product> getAll() {
        return productRepo.findAll();
    }
}
