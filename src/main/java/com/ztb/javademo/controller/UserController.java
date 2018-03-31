package com.ztb.javademo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RestController
@Controller
@RequestMapping(value="/v1")
public  class UserController {

//    @RequestMapping(value = "/show/{userName}",method = RequestMethod.GET)
//    public String getUserName(@RequestParam String userName)
//    {
//        return userName;
//    }

    @RequestMapping(value = "/users/{username}",method = RequestMethod.GET)
    public String getUser(@PathVariable String username){
        return "Welcome,"+username;
    }




}
