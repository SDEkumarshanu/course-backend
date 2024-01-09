package com.example.springrest.services;
import java.util.List;
import java.util.Optional;

import com.example.springrest.entities.Course;

public interface CourseService {

	public List<Course> getCourses();
	public Course addCourse(Course course);
	public void deleteCourse(long parseLong);
	public Course updateCourse(Course course);
	public Optional<Course> getCourse(long courseId);

	
}
