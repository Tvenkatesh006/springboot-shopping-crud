package com.shopping.springboot_shopping_crud.Services;

import com.shopping.springboot_shopping_crud.Models.UserPrincipal;
import com.shopping.springboot_shopping_crud.Models.Users;
import com.shopping.springboot_shopping_crud.Repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    UserRepo users;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users user = users.findByUsername(username);
        if(user == null){
            System.out.println("Username Not found");
            return null;
        }

        return new UserPrincipal(user);
    }

}
