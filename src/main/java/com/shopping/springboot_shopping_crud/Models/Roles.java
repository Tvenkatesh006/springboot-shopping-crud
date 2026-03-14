package com.shopping.springboot_shopping_crud.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Roles {
    @Id
    @GeneratedValue
    private int roleId;
    private int roleName;

    public Roles(int role_ID, int role_Name) {
        this.roleId = role_ID;
        this.roleName = role_Name;
    }

    public Roles() {
    }

    public int getRoleName() {
        return roleName;
    }

    public void setRoleName(int roleName) {
        this.roleName = roleName;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }
}
