package com.cn.loan.serviceIpml;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cn.loan.dao.UserDao;
import com.cn.loan.pojo.User;
import com.cn.loan.service.UserService;



@Service("userService")
public class UserServiceImpl implements UserService{

	@Resource  
    private UserDao userDao; 


	public User getUserById(int userId) {
		return this.userDao.selectByPrimaryKey(userId);  
	}


	public void addUser(User user) {
		// TODO Auto-generated method stub
		try {
			 this.userDao.insert(user);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}


	public void update(User user) {
		// TODO Auto-generated method stub
		this.userDao.updateByPrimaryKeySelective(user);
	}


	public void deleteById(int userId) {
		// TODO Auto-generated method stub
		this.userDao.deleteByPrimaryKey(userId);
	}

}
