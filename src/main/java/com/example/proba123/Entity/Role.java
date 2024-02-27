package com.example.proba123.Entity;



public enum Role {
    USER("Пользователь"),
    ADMIN("АДМИНИСТРАТОР");
    private final String name;
    Role(String name){
        this.name=name;
    }

}