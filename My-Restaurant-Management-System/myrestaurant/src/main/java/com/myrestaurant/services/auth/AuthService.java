package com.myrestaurant.services.auth;

import com.myrestaurant.dtos.SingupRequest;
import com.myrestaurant.dtos.UserDto;

public interface AuthService  {
    UserDto createUser(SingupRequest singupRequest);
}
