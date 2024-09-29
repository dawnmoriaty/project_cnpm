package com.example.project.controller;

import com.example.project.service.CategoryServiceImpl;
import com.example.project.service.CloudinaryService;
import com.example.project.service.ProductServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/products")
@AllArgsConstructor
public class ProductController {
    private final CategoryServiceImpl categoryService;
    private final ProductServiceImpl productService;
    private final CloudinaryService cloudinaryService;

    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("product",productService.getAll());
        return "home";
    }


}
