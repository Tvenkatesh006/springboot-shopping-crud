package com.shopping.springboot_shopping_crud.Controllers;

import com.shopping.springboot_shopping_crud.Models.Products;
import com.shopping.springboot_shopping_crud.Services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService product_service;

    @GetMapping("/products")
    List<Products> getProducts(){
        return product_service.getProducts();
    }

    @GetMapping("/products/{prod_ID}")
    Products getProductByID(@PathVariable int prod_ID){
        return product_service.getProductByID(prod_ID);
    }

    @PostMapping("/products")
    void postProduct(@RequestBody Products product){
        product_service.postProduct(product);
    }

    @PutMapping("/products")
    void updateProduct(@RequestBody Products product){
        product_service.updateProduct(product);
    }

    @DeleteMapping("/products/{prod_ID}")
    void deleteProductByID(@PathVariable int prod_ID){
        product_service.deleteProductByID(prod_ID);
    }
}
