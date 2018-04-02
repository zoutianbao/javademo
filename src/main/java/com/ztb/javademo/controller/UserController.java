package com.ztb.javademo.controller;


import Model.UserEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RestController
@Controller
@RequestMapping(value="/v1")
public  class UserController {

    /*
    * query userName
    * */
    @RequestMapping(value = "/query/{userName}",method = RequestMethod.GET)
    public Boolean getUserName(@RequestParam String userName)
    {
        return true;
    }



    /*
    * add user
    * */
    @RequestMapping(value = "/add/users/",method = RequestMethod.POST)
    public Boolean addUser(@RequestBody UserEntity userInfo){

        return true;
    }




}
