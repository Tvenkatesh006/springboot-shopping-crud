package com.shopping.springboot_shopping_crud.Models;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Users {
    @Id
    @GeneratedValue
    private int userId;
    private String username;
    private String password;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name = "user_roles" , joinColumns = @JoinColumn(name = "userId") , inverseJoinColumns = @JoinColumn(name = "roleId") )
    private Set<Roles> roles;
}
