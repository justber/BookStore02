package com.atguigu.test;

import org.junit.jupiter.api.Test;

import com.atguigu.bean.User;
import com.atguigu.dao.UserDao;
import com.atguigu.dao.impl.UserDaoImpl;

class UserDaoImplTest {

	private UserDao userDao = new UserDaoImpl();
	@Test
	void testGetUser() {
		User user = userDao.getUser(new User(null, "test01", "test010", null));
		
		System.out.println(user);
		
	}

}
