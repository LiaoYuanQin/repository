package com.simple.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 声明使用功能类FunctionService的bean
 * @Service 声明UseFunctionService类是spring管理的一个Bean
 * @author Administrator
 *
 */
@Service
public class UseFunctionService {
    /*@Autowired 把FunctionService的实体bean注入到UseFunctionService类中
     * 让UseFunctionService具备FunctionService的功能 ———— 组合关系
     * */
    @Autowired
    private FunctionService functionService;

    public String sayHello(String word) {
        return functionService.sayHello(word);
    }

}