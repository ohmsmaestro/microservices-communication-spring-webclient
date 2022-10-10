package com.api.userservice.service;


import com.api.userservice.dto.ResponseDto;
import com.api.userservice.entity.User;

public interface UserService {
    User saveUser(User user);

    ResponseDto getUser(Long userId);
}