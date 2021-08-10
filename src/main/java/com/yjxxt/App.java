package com.yjxxt;


import com.yjxxt.dao.AccountDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

//指定配置类 充当配置文件
@Configuration
@ComponentScan("com.yjxxt") //指定扫描的范围
public class App {
    //模拟核心配置文件

    @Bean
    public AccountDao accountDao() {
        return new AccountDao();
    }

    @Value("${jdbc.driver}")
    private String driver;
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.username}")
    private String userName;
    @Value("${jdbc.password}")
    private String password;
    // 控制台打印属性值信息
    public void showConfigInfo(){
        System.out.println("driver:" + driver);
        System.out.println("url:" + url);
        System.out.println("userName:" + userName);
        System.out.println("password:" + password);
    }
}
