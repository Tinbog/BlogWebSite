package com.mojo.experience;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@MapperScan("com.mojo.experience.mapper")
@EnableWebMvc
public class ExperienceApplication {
	public static void main(String[] args) {
		SpringApplication.run(ExperienceApplication.class, args);
	}

}
