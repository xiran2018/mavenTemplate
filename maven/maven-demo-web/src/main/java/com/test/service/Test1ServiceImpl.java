package com.test.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.test.mapper.Test1Mapper;

@Service
public class Test1ServiceImpl implements Test1Service{

	@Resource
	Test1Mapper tr ;
	
	@Override
	public int lineNumbers() {
		// TODO Auto-generated method stub
		return tr.selectCount();
	}
	
}
