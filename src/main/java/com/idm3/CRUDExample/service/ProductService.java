package com.idm3.CRUDExample.service;

import com.idm3.CRUDExample.model.Product;
import com.idm3.CRUDExample.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepo;
    public Optional<Product> findOne(Long id) {
        return productRepo.findById(id);
    }
    public void saveProduct(Product a) {
        productRepo.save(a);
    }
    public List<Product> findAll() {
        return (List<Product>) productRepo.findAll();
    }
    public void deleteByID(long productID) {
        productRepo.deleteById(productID);
    }
}
