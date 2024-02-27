package com.example.proba123.Controller;


import com.example.proba123.Dt.UsersDt;
import com.example.proba123.Service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/registration")
public class AuthController{
    private final UserService userService;
    @GetMapping
    public String registerForm(){
        return "registration";
    }
    @PostMapping
    public String registerUser(UsersDt usersDt){
        userService.registration(usersDt);
        return "redirect:/login";
    }





}
