package com.debora.stock.services;

import com.debora.stock.model.Product;
import com.debora.stock.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServices {

    @Autowired
    private Repository productRepository;

    public Product save (Product p) {
        return productRepository.save(p);
    }

    public List<Product> listAll() {
        return productRepository.findAll();
    }
}
