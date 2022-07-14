package com.adapty.shopping.services;

import java.util.List;
import java.util.Optional;

import com.adapty.shopping.entities.CATEGORY;
import com.adapty.shopping.entities.Product;

public interface ProductInterface {

    public List<Product> findAllProducts();

    public Optional<Product> findByProductId(Product obj);

    public Optional<List<Product>> findByProductCategory(CATEGORY productCategory);

    
    public String addProduct(Product productObj);//post

    
    public Product updateByProductId(Product productObj);//put

    public String deleteByProductId(Product productObj);

   
}
