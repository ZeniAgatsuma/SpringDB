package com.zeni.controller;

import com.zeni.entity.Category;
import com.zeni.service.CategoryService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/categories")
public class CategoryController {

    private final CategoryService categoryService;

    // Впровадження залежностей через конструктор
    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    // Отримати всі категорії
    @GetMapping
    public String getAllCategories(Model model) {
        List<Category> categories = categoryService.getAllCategories();
        model.addAttribute("categories", categories);
        return "categories";
    }
}
