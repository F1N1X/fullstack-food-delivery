package com.food.userinfo.service;

import com.food.userinfo.dto.UserDTO;
import com.food.userinfo.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepo userRepo;

    public UserDTO addUser(UserDTO userDTO) {

    }
}
