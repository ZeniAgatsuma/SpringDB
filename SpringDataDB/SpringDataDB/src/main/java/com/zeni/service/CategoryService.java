package com.zeni.service;

import com.zeni.entity.Category;
import com.zeni.repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    private final com.zeni.repository.CategoryRepository categoryRepository;

    // Впровадження залежностей через конструктор
    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    // Отримати всі категорії
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    // Зберегти категорію
    public void saveCategory(Category category) {
        categoryRepository.save(category);
    }
}

