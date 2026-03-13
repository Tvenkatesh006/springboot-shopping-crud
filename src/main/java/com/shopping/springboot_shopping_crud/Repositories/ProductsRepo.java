package com.shopping.springboot_shopping_crud.Repositories;

import com.shopping.springboot_shopping_crud.Models.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepo extends JpaRepository<Products,Integer> {

}
