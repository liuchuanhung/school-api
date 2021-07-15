package com.liuchuanhung.schoolapi.services;

import com.liuchuanhung.schoolapi.models.Course;

import java.util.List;

public interface CourseService {

    Course findCourseById(Long id);
    Course createCourse(Course course);
    List<Course> findAllCourses(int page, int size);
    List<Course> findAllCoursesByTeacherId(Long teacherId, int page, int size);
}