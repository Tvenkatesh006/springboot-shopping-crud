package com.shopping.springboot_shopping_crud.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.stereotype.Component;

@Component
@Entity
public class Products {
    @Id
    private int prod_ID;
    private String prod_Name;
    private String prod_Price;

    public Products(){

    }

    public Products(int prod_ID, String prod_Name, String prod_Price) {
        this.prod_ID = prod_ID;
        this.prod_Name = prod_Name;
        this.prod_Price = prod_Price;
    }

    public int getProd_ID() {
        return prod_ID;
    }

    public void setProd_ID(int prod_ID) {
        this.prod_ID = prod_ID;
    }

    public String getProd_Name() {
        return prod_Name;
    }

    public void setProd_Name(String prod_Name) {
        this.prod_Name = prod_Name;
    }

    public String getProd_Price() {
        return prod_Price;
    }

    public void setProd_Price(String prod_Price) {
        this.prod_Price = prod_Price;
    }
}
