package com.shopping.springboot_shopping_crud.Repositories;

import com.shopping.springboot_shopping_crud.Models.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<Users,Integer> {
}
