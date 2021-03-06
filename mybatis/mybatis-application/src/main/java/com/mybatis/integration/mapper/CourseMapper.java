package com.mybatis.integration.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.mybatis.integration.model.CourseModel;

@Mapper
public interface CourseMapper {
 
    List<CourseModel> findCourses();
    List<CourseModel> findByCredits(Long credits);
    
}
