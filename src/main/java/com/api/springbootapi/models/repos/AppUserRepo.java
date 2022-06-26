package com.api.springbootapi.models.repos;

import java.util.Optional;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.api.springbootapi.models.entities.AppUser;

public interface AppUserRepo extends PagingAndSortingRepository<AppUser, Long>{
    Optional<AppUser>findByEmail(String email);
}
