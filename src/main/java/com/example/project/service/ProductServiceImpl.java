package com.example.project.service;

import com.example.project.model.dto.request.ProductRequest;
import com.example.project.model.entity.Product;
import com.example.project.repository.IProductRepo;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements IProductService{
    private final IProductRepo productRepo;

    @Override
    public Product saveOrUpdate(ProductRequest productRequest) {
        return null;
    }

    @Override
    public Product findById(Long id) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public Page<Product> paginate(Pageable pageable) {
        return null;
    }

    @Override
    public Set<Product> findByName(String name) {
        return Set.of();
    }
}
