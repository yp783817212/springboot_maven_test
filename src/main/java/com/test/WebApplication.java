package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration//配置控制  
@EnableAutoConfiguration//启用自动配置
@ComponentScan(basePackages="com.test")//组件扫描
public class WebApplication extends SpringBootServletInitializer {
	
	@Override  
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {  
            return application.sources(WebApplication.class);  
    }  
	
	public static void main(String[] args) {
		
		SpringApplication.run(WebApplication.class,args);
		
	}
}
