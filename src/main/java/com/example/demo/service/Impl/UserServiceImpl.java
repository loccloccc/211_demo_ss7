package com.example.demo.service.Impl;

import com.example.demo.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public String getUserById(Long id) {
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        return "User information with ID : " + id;
    }

    @Override
    public void deleteUserById(Long id) {
        System.out.println("Delete user with ID : " + id);
    }
}
