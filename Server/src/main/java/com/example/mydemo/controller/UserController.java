package com.example.mydemo.controller;
import com.example.mydemo.pojo.MyUsers;
import com.example.mydemo.pojo.User;
import com.example.mydemo.service.impl.UserServiceImpl;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserServiceImpl userServer;

    //@CrossOrigin
    //@GetMapping(value="/getuserlist")
    //public List<User> getUserList()
    //{
      //  return userServer.getUserList();
    //}


//    @CrossOrigin
//    @PostMapping(value = "/login")
//    public HashMap<String,Object> login(User user){
//        HashMap<String,Object> map=new HashMap<String,Object>();
//        if(userServer.login(user)==null ||userServer.login(user).isEmpty()){
////           map.put("user",user);
//            map.put("code",400);
//            map.put("message","failed");
//            return map;
//
//        }else {
//            map.put("message",200);
//            map.put("user",user.getName());
//            return  map;
//        }
//    }

    @CrossOrigin
    @PostMapping(value = "/test")
    public User test(@Param("account") String account){
        return  userServer.test(account);
    }

    @CrossOrigin
    @PostMapping(value="/login")
    public boolean login(@Param("account")String account,@Param("password")String password){
        return userServer.login(account,password);
    }

}
