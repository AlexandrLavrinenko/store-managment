package ua.store.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ua.store.entity.Product;
import ua.store.repository.ProductRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DefaultProductService implements ProductService {
    private final ProductRepository productRepository;

    @Override
    public List<Product> findAllProducts() {
        return this.productRepository.findAll();
    }

    @Override
    public Product createProduct(String title, String details) {
        return this.productRepository.save(new Product(null, title, details));
    }
}
