package com.shopping.springboot_shopping_crud.Services;

import com.shopping.springboot_shopping_crud.Models.Users;
import com.shopping.springboot_shopping_crud.Repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepo users;

    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);

    public void postUser(String username , String password) {
        Users user = new Users();
        user.setUsername(username);
        user.setPassword(encoder.encode(password));
        users.save(user);
    }
}
