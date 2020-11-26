package com.offcn.controller;


import com.offcn.pojo.User;
import com.offcn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {


    @Autowired
    private UserService userService;


    @GetMapping("/findOne/{id}")
    public User findOne(@PathVariable("id") Integer id){
        User user = userService.findOne(id);
        return user;
    }


    @DeleteMapping("/delete/{id}")
    public String deleteById(@PathVariable("id") Integer id){
        userService.delete(id);
        return "success";
    }



    @GetMapping("/findAll")
    public List<User> findAll(){
        List<User> all = userService.findAll();
        return all;
    }



    @DeleteMapping("/del/{id}")
    public String aaa(Integer id){
        return ""+id;
    }



    @PostMapping("/add")
    public String add(@RequestBody User user){
        try {
            userService.add(user);
            System.out.println(user);
            return "success";
        }catch (Exception e){
            return "fail";
        }
    }
}
