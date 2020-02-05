package com.mazhang.springboot.web;

import com.mazhang.springboot.pojo.User;
import com.mazhang.springboot.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@Slf4j
@RestController
@RequestMapping("user")
public class SpringbootController {

    @Autowired
    private UserService userService;

    @GetMapping("{id}.do")
    public User hello(@PathVariable("id") Integer id){

        User user = userService.findById(id);
        return user;
    }
}
