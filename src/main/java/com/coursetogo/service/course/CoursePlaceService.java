package com.coursetogo.service.course;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coursetogo.dto.course.CoursePlaceDTO;
import com.coursetogo.mapper.course.CoursePlaceMapper;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class CoursePlaceService {
	
	@Autowired
	private CoursePlaceMapper mapper;
	
	
	public boolean insertCoursePlace(CoursePlaceDTO CoursePlace) throws Exception {
		boolean result = false;
				
		int res = mapper.insertCoursePlace(CoursePlace);
		
		if(res != 0) {
			result = true;
		} else {
		}
		
		return result;
		
	}
	
	public boolean deleteCoursePlace(int courseId) throws SQLException {
		boolean result = false;
		
		int res = mapper.deleteCoursePlace(courseId);
		if(res != 0) {
			result = true;
		}
		
		return result;
	}
}
