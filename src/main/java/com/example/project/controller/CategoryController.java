package com.example.project.controller;

import com.example.project.model.dto.request.CategoryRequest;
import com.example.project.model.entity.Category;
import com.example.project.service.CategoryServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/categories")
@AllArgsConstructor
public class CategoryController {
    private final CategoryServiceImpl categoryService;
    @GetMapping("/home")
    public String  Home(){
        ModelAndView view = new ModelAndView("home");
        return "home";
    }
    @GetMapping
    public String getAllCategories(Model model) {
        List<Category> categories = categoryService.getAllCategories();
        model.addAttribute("categories", categories);
        return "list"; // Trả về view danh sách category
    }

    @GetMapping("/{id}")
    public String getCategoryById(@PathVariable Long id, Model model) {
        Optional<Category> category = categoryService.getCategoryById(id);
        model.addAttribute("category", category);
        return "detail"; // Trả về view chi tiết category
    }

    @PostMapping("/create")
    public String createCategoryForm(Model model,CategoryRequest categoryRequest) {
        model.addAttribute("categoryRequest", categoryService.createCategory(categoryRequest));
        return "create"; // Trả về view tạo category
    }
    @PutMapping("/update/{id}")
    public String update(CategoryRequest categoryRequest, Model model,@PathVariable Long id) {
        model.addAttribute("category", categoryService.update(id,categoryRequest));
        return "update";
    }
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        categoryService.deleteCategory(id);
        return "list";
    }

    @GetMapping("/paginate")
    public String paginate(Model model, Pageable pageable) {
        Page<Category> categories = categoryService.getCategoriesWithPagination(pageable);
        model.addAttribute("categories", categories);
        return "paginate";
    }
    @GetMapping("/search/{keyword}")
    public String search(@PathVariable String keyword, Model model) {
        List<Category> categories = categoryService.findCategoriesByName(keyword);
        model.addAttribute("categories", categories);
        return "search";
    }

    
}
