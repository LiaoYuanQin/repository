package com.simple.springboot.service;

import org.springframework.stereotype.Service;

/**
 * 定义功能类的bean
 * @Service注解声明当前FunctionService类是spring管理的一个bean
 * 声明bean的注解还有：
 * @Repository 数据访问层使用
 * @Controller 展现层使用
 * @Component  声明被spring管理的组件(也就是自动注入spring容器)，没有明确角色
 * @author Administrator
 *
 */
@Service
public class FunctionService {

    public String sayHello(String word) {
        return "hello " + word + " !";
    }

}