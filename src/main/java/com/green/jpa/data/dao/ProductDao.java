package com.green.jpa.data.dao;

import com.green.jpa.data.entity.ProductEntity;

public interface ProductDao {
    ProductEntity insertProduct(ProductEntity p);
    ProductEntity selectProduct(Long number);
    ProductEntity updateProductName(Long number, String name) throws Exception;
    void deleteProduct(Long number);
}
