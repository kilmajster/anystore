package com.store.domain;

import java.util.List;

public class Cart {
    
    private List<ProductEntity> products;

    public List<ProductEntity> getProducts() {
        return products;
    }

    public void setProducts(List<ProductEntity> products) {
        this.products = products;
    }
    
    public Double getTotalPrice() {
        return products.stream().mapToDouble(ProductEntity::getPrice).sum();
    }
}
