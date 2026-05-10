package com.debora.stock.repository;

import com.debora.stock.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findByNameContainingIgnoreCase(String name);

    Optional<Product> findByNameIgnoreCaseAndCategoryIgnoreCase(
            String name, String category
    );
}