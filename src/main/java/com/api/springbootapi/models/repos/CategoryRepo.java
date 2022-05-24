package com.api.springbootapi.models.repos;

import com.api.springbootapi.models.entities.Category;

import org.springframework.data.repository.CrudRepository;

public interface CategoryRepo extends CrudRepository<Category, Long>{
    
}
