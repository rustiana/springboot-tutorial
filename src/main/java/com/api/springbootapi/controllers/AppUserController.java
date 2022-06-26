package com.api.springbootapi.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.api.springbootapi.dto.AppUserData;
import com.api.springbootapi.dto.ResponseData;
import com.api.springbootapi.models.entities.AppUser;
import com.api.springbootapi.services.AppUserService;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/api/users") 
public class AppUserController {
    @Autowired
    private AppUserService appUserService;

    @Autowired
    private ModelMapper modelMapper;

    @PostMapping("/register")
    public ResponseEntity<ResponseData <AppUser>> register(@RequestBody AppUserData userData){
        ResponseData<AppUser> responseData = new ResponseData<>();
        AppUser appUser = modelMapper.map(userData, AppUser.class);

        responseData.setPayload(appUserService.registerAppUser(appUser));
        responseData.getMessages().add("AppUser saved!");
        return ResponseEntity.ok(responseData);
    }
}
