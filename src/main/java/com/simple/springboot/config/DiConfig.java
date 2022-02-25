package com.simple.springboot.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
/**
 * spring配置类
 * @Configuration 声明当前类是一个配置类
 * @ComponentScan 注解自动扫描指定包下的所有使用@Service @Component @Repository
 * 和@Controller的类，并注册为Bean
 * @author Administrator
 *
 */
@Configuration
@ComponentScan("com.simple.springboot")
public class DiConfig {

}
