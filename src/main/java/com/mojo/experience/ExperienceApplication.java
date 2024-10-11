package com.mojo.experience;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.mojo.experience.pojo")
public class ExperienceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExperienceApplication.class, args);
	}

}
