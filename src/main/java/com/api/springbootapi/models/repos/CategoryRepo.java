package com.api.springbootapi.models.repos;

import com.api.springbootapi.models.entities.Category;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CategoryRepo extends PagingAndSortingRepository<Category, Long>{
    Page<Category> findByNameContains(String name, Pageable pageable);
}
