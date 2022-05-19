package com.api.springbootapi.models.repos;

import com.api.springbootapi.models.entities.Product;

import org.springframework.data.repository.CrudRepository;

public interface ProductRepo extends CrudRepository<Product, Long>{
    
}
