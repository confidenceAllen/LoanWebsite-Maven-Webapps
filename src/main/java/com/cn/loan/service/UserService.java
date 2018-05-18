package com.cn.loan.service;

import com.cn.loan.pojo.User;
import org.springframework.stereotype.Component;


@Component
public interface UserService {
	 User getUserById(int userId);

	void addUser(User user);
	
	void update(User user);
	
	void deleteById(int userId);
}
