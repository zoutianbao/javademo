package com.ztb.javademo.controller;

import com.ztb.javademo.UserEntity.UserEntity;
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
        String a="zouqimeng";
        return "success";
    }
}
