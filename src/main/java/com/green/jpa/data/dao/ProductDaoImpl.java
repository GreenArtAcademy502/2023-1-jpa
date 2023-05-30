package com.green.jpa.data.dao;

import com.green.jpa.data.entity.ProductEntity;
import com.green.jpa.data.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class ProductDaoImpl implements ProductDao {

    private final ProductRepository repository;

    @Autowired
    public ProductDaoImpl(ProductRepository repository) {
        this.repository = repository;
    }

    @Override
    public ProductEntity insertProduct(ProductEntity p) {
        return repository.save(p);
    }

    @Override
    public ProductEntity selectProduct(Long number) {
        return repository.getReferenceById(number);
    }

    @Override
    public ProductEntity updateProductName(Long number, String name) throws Exception {
        ProductEntity selectedProduct = repository.getReferenceById(number);
        selectedProduct.setName(name);
        selectedProduct.setUpdatedAt(LocalDateTime.now());
        return repository.save(selectedProduct);
    }

    @Override
    public void deleteProduct(Long number) {

    }
}
