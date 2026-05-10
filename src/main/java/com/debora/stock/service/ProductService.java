package com.debora.stock.service;

import com.debora.stock.exception.ResourceNotFoundException;
import com.debora.stock.model.Product;
import com.debora.stock.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Product findById(Long id) {
        return productRepository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Product not found with id: " + id));
    }

    public Product save(Product product) {

        String name = product.getName().trim();
        String category = product.getCategory().trim();

        var existingProduct =
                productRepository.findByNameIgnoreCaseAndCategoryIgnoreCase(name, category);

        if (existingProduct.isPresent()) {
            Product existing = existingProduct.get();

            existing.setQuantity(existing.getQuantity() + product.getQuantity());

            existing.setPrice(product.getPrice());

            return productRepository.save(existing);
        }

        product.setName(name);
        product.setCategory(category);

        return productRepository.save(product);
    }

    public Product update(Long id, Product p) {
        Product existingProduct = findById(id);

        existingProduct.setName(p.getName());
        existingProduct.setPrice(p.getPrice());
        existingProduct.setQuantity(p.getQuantity());
        existingProduct.setCategory(p.getCategory());

        return productRepository.save(existingProduct);
    }

    public void delete(Long id) {
        Product product = findById(id);
        productRepository.delete(product);
    }

    public Optional<Product> findByNameAndCategory(String name, String category) {
        return productRepository
                .findByNameIgnoreCaseAndCategoryIgnoreCase(name, category);
    }
}