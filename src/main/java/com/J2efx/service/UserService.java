package com.J2efx.service;

import com.J2efx.mapper.UserMapper;
import com.J2efx.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService {
    @Resource
    UserMapper userMapper;

    public List<User> getAllUsers(){
        return userMapper.findAll();
    }
    public void isDi(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        userMapper = (UserMapper) applicationContext.getBean("userMapper1");
        System.out.println(userMapper);
    }
}
