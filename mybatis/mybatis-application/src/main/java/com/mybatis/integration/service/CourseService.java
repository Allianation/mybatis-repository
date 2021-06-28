package com.mybatis.integration.service;

import java.util.List;

import com.mybatis.integration.model.CourseModel;

public interface CourseService {
	
	public List<CourseModel> findCourses();
	public List<CourseModel> findByCredits(Long credits);

}
