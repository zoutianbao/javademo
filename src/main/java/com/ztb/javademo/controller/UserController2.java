package com.ztb.javademo.controller;

import Model.UserEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController2 {

    private UserEntity user;

    @RequestMapping(value = "/registry",method = RequestMethod.POST )
   // @ResponseBody
    public String  registry(@RequestBody UserEntity zzz){
        return "success";
    }


    @RequestMapping(value = "/registry/{userName}/{pwd}",method = RequestMethod.GET )
    public String  registry(@PathVariable String userName,String  pwd){
        int a=1;
        int b=2;
        int v=2;
        return "success";
    }
}
