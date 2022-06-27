package com.api.springbootapi.utils;

import java.util.Optional;

import org.springframework.data.domain.AuditorAware;
import org.springframework.security.core.context.SecurityContextHolder;

import com.api.springbootapi.models.entities.AppUser;

public class AuditorAwareImpl implements AuditorAware<String> {

    @Override
    public Optional<String> getCurrentAuditor() {
        AppUser currentUser = (AppUser) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return Optional.of(currentUser.getEmail());
    }
    
}
