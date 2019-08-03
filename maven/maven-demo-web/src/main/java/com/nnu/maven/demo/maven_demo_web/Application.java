package com.nnu.maven.demo.maven_demo_web;

import org.apache.log4j.Logger;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan("com.test.controller")//包名
@ComponentScan("com.test.service")
@MapperScan("com.test.mapper")
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class Application{
	 private static Logger logger = Logger.getLogger(Application.class);

	    public static void main(String[] args) {
	        logger.info("=================开始成功=================");
	        SpringApplication.run(Application.class, args);
	        logger.info("=================启动成功=================");
	    }
}
