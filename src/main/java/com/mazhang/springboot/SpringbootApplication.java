package com.mazhang.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.mazhang.springboot.mapper")
public class SpringbootApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringbootApplication.class);
    }

}
