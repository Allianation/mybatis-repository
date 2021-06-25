package com.mybatis.integration.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CourseModel implements Serializable {

	private static final long serialVersionUID = 8524782903559358529L;
	
	private String name;
	private Long credits;
	
}
