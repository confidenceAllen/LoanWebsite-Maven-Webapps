package com.cn.loan.service;

import com.cn.loan.pojo.User;



public interface UserService {
	public User getUserById(int userId);  
	
	public void addUser(User user);
	
	public void update(User user);
	
	public void deleteById(int userId);
}
