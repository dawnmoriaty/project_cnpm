package com.example.project.service;

import com.example.project.model.dto.request.CategoryRequest;
import com.example.project.model.entity.Category;
import com.example.project.repository.ICategoryRepo;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CategoryServiceImpl implements ICategoryService {

    private final ICategoryRepo categoryRepo;

    @Override
    public Category createCategory(CategoryRequest categoryRequest) {
        Category category = new Category();
        category.setCategoryName(categoryRequest.getCategoryName());
        category.setCategoryName(categoryRequest.getCategoryName());
        category.setProduct(categoryRequest.getProduct());
        return categoryRepo.save(category);
    }

    @Override
    public List<Category> getAllCategories() {
        return categoryRepo.findAll();
    }

    @Override
    public Optional<Category> getCategoryById(Long id) {
        return categoryRepo.findById(id);
    }

    @Override
    public Category update(Long id, CategoryRequest categoryRequest) {
        Category category = categoryRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Category not found"));

        category.setCategoryName(categoryRequest.getCategoryName());
        category.setDescription(categoryRequest.getDescription());
        category.setProduct(categoryRequest.getProduct());

        return categoryRepo.save(category);
    }

    @Override
    public void deleteCategory(Long id) {
        categoryRepo.deleteById(id);
    }

    @Override
    public List<Category> findCategoriesByName(String name) {
        return categoryRepo.findCategoryByCategoryName(name);
    }

    @Override
    public Page<Category> getCategoriesWithPagination(Pageable pageable) {
        return categoryRepo.findAll(pageable);
    }
}
