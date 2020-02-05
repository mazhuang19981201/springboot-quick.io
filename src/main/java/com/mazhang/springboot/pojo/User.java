package com.mazhang.springboot.pojo;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 用户的实体类
 */
@Data
@Table(name = "sys_user")
public class User {

    @Id
    @KeySql(useGeneratedKeys = true)
    private Integer user_id;
    private String user_code;
    private String user_name;
    private String user_password;
    private Integer user_state;
}
