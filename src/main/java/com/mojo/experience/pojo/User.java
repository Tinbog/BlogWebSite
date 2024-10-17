package com.mojo.experience.pojo;

import lombok.Data;
import org.springframework.stereotype.Repository;
@Data
@Repository
public class User {
    private int id;
    private String username;
    private String password;
}
