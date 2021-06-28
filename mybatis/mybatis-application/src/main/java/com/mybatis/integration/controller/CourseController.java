package com.mybatis.integration.controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mybatis.integration.model.CourseModel;
import com.mybatis.integration.service.CourseService;

@RestController
@RequestMapping(path = { "v1/mybatis/course" }, produces = APPLICATION_JSON_VALUE)
public class CourseController {

	@Autowired
	private CourseService courseService;

	@GetMapping
	public ResponseEntity<String> findCourses() {

		List<CourseModel> aCourseModel = courseService.findCourses();

		if (aCourseModel.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Courses not found!!!");
		}

		return ResponseEntity.status(HttpStatus.OK).body(aCourseModel.toString());

	}
	
	@GetMapping(path = "/{credits}")
	public ResponseEntity<String> findByCredits(@PathVariable(value = "credits") final Long credits) {
		
		List<CourseModel> aCourseModel = courseService.findByCredits(credits);
		
		if (aCourseModel.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Course not found!!!");
		}

		return ResponseEntity.status(HttpStatus.OK).body(aCourseModel.toString());
    }

}
