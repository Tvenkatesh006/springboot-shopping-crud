package com.shopping.springboot_shopping_crud.Controllers;

import com.shopping.springboot_shopping_crud.Models.Users;
import com.shopping.springboot_shopping_crud.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.stereotype.Controller
public class AuthenticationController {

    @Autowired
    UserService userService;

    @GetMapping("/login")
    public String login() {
        return "login";   // login.html
    }

    @GetMapping("/signup")
    public String signupPage() {
        return "signup"; // loads templates/signup.html
    }

    @PostMapping("/signup")
    public String registerUser(@RequestParam String username,
                               @RequestParam String password) {
        userService.postUser(username,password);
        return "redirect:/login";
    }
}
