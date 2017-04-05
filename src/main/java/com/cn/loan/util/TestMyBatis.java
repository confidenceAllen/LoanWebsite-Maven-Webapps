package com.cn.loan.util;
import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.cn.loan.pojo.User;
import com.cn.loan.service.UserService;


@RunWith(SpringJUnit4ClassRunner.class) 
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})  

public class TestMyBatis {
	private static Logger logger = Logger.getLogger(TestMyBatis.class);
	
	@Resource
	private  UserService userService = null;

	
	@Test
	public void test1(){
		User user = userService.getUserById(5);  
        // System.out.println(user.getUserName());  
        // logger.info("值："+user.getUserName());  
        logger.info(JSON.toJSONString(user));  
        
/*        Book book = bookService.getBookById(2);
        logger.info(JSON.toJSON(book));
        
        User user2 = new User();
        user2.setAge(23);
        user2.setUserName("厉害了我的歌");
        user2.setPassword("123");
        userService.addUser(user2);
        logger.debug(user2);*/
        
/*        bookService.deleteById(2);*/
        
/*        Book book2 = new Book();
        book2.setBookid(2);
        book2.setBookname("SQLsxue");
        bookService.addBook(book2);*/
        
        
        
	}
	
/*	public static void main(String[] args){
		User user = userService.getUserById(1);  
		System.out.println("1");
		System.out.println(JSON.toJSON(user));
        // System.out.println(user.getUserName());  
        // logger.info("值："+user.getUserName());  
        logger.info(JSON.toJSONString(user)); 
	}*/
}
