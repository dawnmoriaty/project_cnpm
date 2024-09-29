package com.example.project.service;

import com.example.project.model.dto.request.CategoryRequest;
import com.example.project.model.entity.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface ICategoryService {
    Category createCategory(CategoryRequest categoryRequest);
    List<Category> getAllCategories();
    Optional<Category> getCategoryById(Long id);
    Category update(Long id, CategoryRequest categoryRequest);
    void deleteCategory(Long id);
    List<Category> findCategoriesByName(String name);
    Page<Category> getCategoriesWithPagination(Pageable pageable);
}
