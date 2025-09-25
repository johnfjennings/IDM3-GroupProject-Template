package com.idm3.CRUDExample.repository;

import com.idm3.CRUDExample.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
//add any additions queries here
}
