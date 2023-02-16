package com.example.springproject.services.interfaces;

import com.example.springproject.entities.Product;

import java.util.List;

public interface IProductService {
    List<Product> listOfProducts(String title);
    void saveProduct(Product product);
    void deleteProduct(int id);
    Product getProductById(int id);
}
