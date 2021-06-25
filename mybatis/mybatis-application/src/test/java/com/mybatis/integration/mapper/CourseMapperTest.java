package com.mybatis.integration.mapper;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mybatis.integration.model.CourseModel;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
public class CourseMapperTest {

	@Autowired
	private CourseMapper courseMapper;

	@Test
	void getData() throws Exception {
		
		List<CourseModel> courses = courseMapper.getCourses();
		
		for (CourseModel courseModel: courses) {
			
			log.info(courseModel.toString());
		}

	}

}
