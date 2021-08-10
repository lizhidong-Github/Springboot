package com.yjxxt.service;

import com.yjxxt.dao.AccountDao;
import com.yjxxt.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private AccountDao accountDao;

    public void test01(){
        System.out.println("UserService.test01");
        //调用方法
        userDao.test01();
        accountDao.test01();
    }
}
