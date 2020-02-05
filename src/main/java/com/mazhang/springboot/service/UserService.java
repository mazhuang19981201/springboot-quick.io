package com.mazhang.springboot.service;

import com.mazhang.springboot.mapper.UserMapper;
import com.mazhang.springboot.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User findById(Integer id){
        User user = userMapper.selectByPrimaryKey(id);
        return user;
    }
}
