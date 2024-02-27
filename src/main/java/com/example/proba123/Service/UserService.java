package com.example.proba123.Service;

import com.example.proba123.Dt.UsersDt;
import com.example.proba123.Entity.Role;
import com.example.proba123.Entity.User;
import com.example.proba123.Repo.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepo userRepo;
    private final PasswordEncoder passwordEncoder;
    public String registration(UsersDt usersDt){
        User user = new User();
        user.setUsername(usersDt.getUsername());
        user.setPassword(passwordEncoder.encode(usersDt.getPassword()));
        user.setRoles(Collections.singleton(Role.USER));
        userRepo.save(user);
    }

}
