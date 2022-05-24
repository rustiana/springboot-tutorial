package com.api.springbootapi.models.repos;

import com.api.springbootapi.models.entities.Supplier;

import org.springframework.data.repository.CrudRepository;

public interface SupplierRepo extends CrudRepository<Supplier, Long>{
    
}