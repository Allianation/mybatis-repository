package com.mybatis.integration.mapper;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mybatis.integration.model.CourseModel;

@SpringBootTest
class TestCourseMapper {

	@Autowired
	private CourseMapper courseMapper;

	@Test
	void getData() throws Exception {
		
		List<CourseModel> courses = courseMapper.getCourses();
		
		 assertEquals(2, courses.size());
	  
	}

}
