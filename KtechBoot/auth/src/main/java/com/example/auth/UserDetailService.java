package com.example.auth;

public class UserService {
    private final UserRepository repository;
    public UserService(UserRepository repository){
        this.repository = repository;
    }
    public void create(){
        repository.insert();
    }
    public void read(){}
    public void update(){}
    public void delete(){}
}
