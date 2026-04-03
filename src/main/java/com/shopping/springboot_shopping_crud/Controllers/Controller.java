package com.shopping.springboot_shopping_crud.Controllers;

import com.shopping.springboot_shopping_crud.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    @GetMapping("/home")
    public String home(){
        return "Home";
    }
}
