package com.mazhang.springboot.mapper;

import com.mazhang.springboot.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void test1(){

        User user = userMapper.selectByPrimaryKey(5);

        System.out.println(user);
    }

}
