package com.pactera.reggie;

import com.pactera.reggie.entity.User;
import com.pactera.reggie.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ReggieApplicationTests {
	@Autowired
	private UserMapper userMapper;

	@Test
	void contextLoads() {
	}
	@Test
	public void selectUserById(){
		User user = userMapper.selectById(1);
		System.out.println(user);
	}

}
