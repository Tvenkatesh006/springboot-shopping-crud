package com.shopping.springboot_shopping_crud.Services;

import com.shopping.springboot_shopping_crud.Models.Products;
import com.shopping.springboot_shopping_crud.Repositories.ProductsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductsRepo product_Repo;


    public List<Products> getProducts() {
        return product_Repo.findAll();
    }

    public Products getProductByID(int prod_Id) {
        return product_Repo.getById(prod_Id);
    }

    public void postProduct(Products product) {
        product_Repo.save(product);
    }

    public void updateProduct(Products product) {
        product_Repo.save(product);
    }

    public void deleteProductByID(int prod_ID) {
        product_Repo.deleteById(prod_ID);
    }
}
