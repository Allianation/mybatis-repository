package com.mybatis.integration.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mybatis.integration.mapper.CourseMapper;
import com.mybatis.integration.model.CourseModel;
import com.mybatis.integration.service.CourseService;

@Service
public class CourseServiceImpl implements CourseService{
	
	@Autowired
    private CourseMapper courseMapper;

    @Override
    public List<CourseModel> findCourses() {
        return courseMapper.findCourses();
    }
    
    @Override
    public List<CourseModel> findByCredits(Long credits) {
        return courseMapper.findByCredits(credits);
    }

}
