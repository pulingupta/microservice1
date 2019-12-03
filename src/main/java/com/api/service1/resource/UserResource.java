package com.api.service1.resource;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/user")
public class UserResource {

    @GetMapping
    public List<User> getUsers(){
        return Arrays.asList(
            new User("Peter",2000L),
            new User("SAm",2000L)
        );
    }
    @GetMapping("/{username}")
    public User getUser(@PathVariable("username") final String userName){
        return new User(userName, 3000L);
    }
}