package com.zeni.repository;

import com.zeni.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    // Знайти продукти за категорією
    List<Product> findByCategoryId(Long categoryId);

    // Фільтрація за ціновим діапазоном
    List<Product> findByPriceBetween(double minPrice, double maxPrice);

    // Пошук за назвою
    List<Product> findByNameContainingIgnoreCase(String name);
}