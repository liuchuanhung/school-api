package com.liuchuanhung.schoolapi.services.impl;

import com.liuchuanhung.schoolapi.models.Course;
import com.liuchuanhung.schoolapi.repositories.CourseRepository;
import com.liuchuanhung.schoolapi.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public Course findCourseById(Long id) {
        Optional<Course> courseOptional = courseRepository.findById(id);
        return (courseOptional.isPresent()) ? courseOptional.get(): null;
    }

    public Course createCourse(Course course) {
        return courseRepository.save(course);
    }

    public List<Course> findAllCourses(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        return courseRepository.findAll(pageable).toList();
    }
}