package com.liuchuanhung.schoolapi.controllers;

import com.liuchuanhung.schoolapi.models.Course;
import com.liuchuanhung.schoolapi.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping
    public List<Course> getCourses(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "3") int size
    ) {
        return courseService.findAllCourses(page, size);
    }

    @GetMapping("/teachers/{teacherId}")
    public List<Course> getCoursesByTeacherId(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "3") int size,
            @PathVariable("teacherId") Long teacherId
    ) {
        return courseService.findAllCoursesByTeacherId(teacherId, page, size);
    }

    @GetMapping("/{id}")
    public Course retrieveCourseById(@PathVariable("id") Long id) {
        return courseService.findCourseById(id);
    }

    @PostMapping
    public Course saveCourse(@RequestBody Course course) {
        return courseService.createCourse(course);
    }
}