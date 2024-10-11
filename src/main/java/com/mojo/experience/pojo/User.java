package com.mojo.experience.pojo;

import lombok.Data;
import org.apache.ibatis.annotations.Mapper;

@Mapper
@Data
public class User {
    private int id;
    private String username;
    private String password;
}
