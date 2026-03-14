package com.shopping.springboot_shopping_crud.Repositories;

import com.shopping.springboot_shopping_crud.Models.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepo extends JpaRepository<Roles,Integer> {
}
