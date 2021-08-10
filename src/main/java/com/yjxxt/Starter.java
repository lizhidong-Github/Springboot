package com.yjxxt;

import com.yjxxt.dao.AccountDao;
import com.yjxxt.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Starter {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(App.class);
        //获取bean
        UserService us = app.getBean(UserService.class);
        //掉方法
        us.test01();
        System.out.println("****************");
        System.out.println(app.isSingleton("app"));
        App  ioc= app.getBean(App.class);
        //调用
        AccountDao ad1 = ioc.accountDao();
        AccountDao ad2 = ioc.accountDao();
        //hashcode
        System.out.println(ad1.hashCode());
        System.out.println(ad2.hashCode());
        System.out.println(ad1==ad2);
        System.out.println("*********");
        ioc.showConfigInfo();
    }
}
