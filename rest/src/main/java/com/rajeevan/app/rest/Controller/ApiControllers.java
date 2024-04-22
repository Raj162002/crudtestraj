package com.rajeevan.app.rest.Controller;

import com.rajeevan.app.rest.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiControllers {

    @Autowired
    private UserRepo userRepo;
    @GetMapping(value="/")
    public String getPage(){
        return "Welcome";
    }
    public void  getUsers(){

    }
}
