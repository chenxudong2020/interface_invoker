package com.xxx.invoker.controller;


import com.xxx.invoker.bean.Input;
import com.xxx.invoker.bean.Result;
import com.xxx.invoker.bean.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {


    @PostMapping("/getUser")
    public Result<User> getUser(@RequestBody  Input input){
        String id=input.getId();
        User user=new User();
        user.setName("1的name");
        Result<User> result=new Result<User>();
        result.setCode("200");
        result.setMessage("成功了");
        result.setData(user);
        return result;
    }
}
