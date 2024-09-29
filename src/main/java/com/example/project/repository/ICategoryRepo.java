package com.example.project.repository;

import com.example.project.model.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ICategoryRepo extends JpaRepository<Category, Long> {
    @Query("SELECT c FROM Category c WHERE c.categoryName = ?1")
    List<Category> findCategoryByCategoryName(String name);
}
