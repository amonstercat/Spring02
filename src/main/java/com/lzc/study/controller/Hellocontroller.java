package com.lzc.study.controller;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hellocontroller {
@RequestMapping(value = "/user",method = RequestMethod.GET)
    public  String getUser()
{
    return  "Get-user";
}
@RequestMapping(value = "/user",method = RequestMethod.PUT)
    public  String putUser()
    {
        return  "Put-user";
    }

    @DeleteMapping(value = "/user")
    public  String deleteUser()
    {
        return  "Deletee-user";
    }
}
