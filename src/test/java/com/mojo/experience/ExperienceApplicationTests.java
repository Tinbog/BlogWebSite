package com.mojo.experience;

import com.mojo.experience.mapper.UserMapper;
import com.mojo.experience.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ExperienceApplicationTests {

	@Test
	void contextLoads() {
	}
	@Autowired
	private UserMapper userMapper;

	@Test
	public void findAll() {
		List<User> users = userMapper.selectList(null);
		System.out.println(users);
	}

}
