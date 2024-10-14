package com.zeni.service;

import com.zeni.entity.Product;
import com.zeni.repository.ProductRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    // Впровадження залежностей через конструктор
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    // Отримати всі продукти
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    // Зберегти продукт
    public void saveProduct(Product product) {
        productRepository.save(product);
    }

    // Отримати продукти за категорією
    public List<Product> getProductsByCategory(Long categoryId) {
        return productRepository.findByCategoryId(categoryId);
    }

    // Пагінація
    public Page<Product> getPaginatedProducts(Pageable pageable) {
        return productRepository.findAll(pageable);
    }

    // Фільтрація за ціновим діапазоном
    public List<Product> getProductsByPriceRange(double minPrice, double maxPrice) {
        return productRepository.findByPriceBetween(minPrice, maxPrice);
    }

    // Пошук за назвою
    public List<Product> searchProductsByName(String name) {
        return productRepository.findByNameContainingIgnoreCase(name);
    }
}
