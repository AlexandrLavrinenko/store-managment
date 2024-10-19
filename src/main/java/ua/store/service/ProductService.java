package ua.store.service;

import ua.store.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAllProducts();

    Product createProduct(String title, String details);
}
