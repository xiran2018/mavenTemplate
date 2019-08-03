package com.test.controller;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.mapper.Test1Mapper;
import com.test.service.Test1Service;


@Controller

public class IndexController {
	private static Logger logger = Logger.getLogger(IndexController.class);
	@Resource
	private Test1Service te;
    @RequestMapping(value="/")
    @ResponseBody
    public String index() {
    	int p = te.lineNumbers();
    	System.out.println("LV"+p);
        logger.info("进入index方法");
        return "Hello Spring Boot !";
    }
}
