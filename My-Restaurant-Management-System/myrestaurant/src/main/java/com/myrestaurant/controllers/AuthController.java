package com.myrestaurant.controllers;

import com.myrestaurant.dtos.SingupRequest;
import com.myrestaurant.dtos.UserDto;
import com.myrestaurant.services.auth.AuthService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService){
        this.authService = authService;
    }
    @PostMapping("/signup")
    public ResponseEntity<?> singupUser(@RequestBody SingupRequest singupRequest){
        UserDto createdUserDto = authService.createUser(singupRequest);

        if(createdUserDto == null){
            return new ResponseEntity<>("User not created. Come aging later", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(createdUserDto,HttpStatus.CREATED);
    }
}
