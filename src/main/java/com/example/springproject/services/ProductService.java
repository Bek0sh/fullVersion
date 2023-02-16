package com.example.springproject.services;

import com.example.springproject.entities.Product;
import com.example.springproject.repositories.IProductRepository;
import com.example.springproject.services.interfaces.IProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import java.util.List;

    @Slf4j
    @Service
    public class ProductService implements IProductService {

        private final IProductRepository repo;

        public ProductService(IProductRepository repo) {
            this.repo = repo;
         }

         @Override
        public List<Product> listOfProducts(String title) {
            if(title != null) return repo.findByTitle(title);
            return repo.findAll();
    }

        @Override
        public void saveProduct(Product product) {
            log.info("Saving new {}", product);
            repo.save(product);
    }

        @Override
        public void deleteProduct(int id) {
            repo.deleteById(id);
    }
        @Override
        public Product getProductById(int id) {
            return repo.findById(id).orElseThrow();
    }
}