package com.example.proba123.Repo;


import com.example.proba123.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Long>{
    User findByUsername(String username);

}
