package com.liuchuanhung.schoolapi.controllers;

import com.liuchuanhung.schoolapi.models.Teacher;
import com.liuchuanhung.schoolapi.services.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/teachers")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @GetMapping("/{id}")
    public Teacher getTeacherById(@PathVariable("id") Long id) {
        return teacherService.getTeacherById(id);
    }

    @PostMapping
    public Teacher createTeacher(@RequestBody Teacher teacher) {
        return teacherService.createTeacher(teacher);
    }

    @DeleteMapping("/{id}")
    public void deleteTeacherById(@PathVariable("id") Long id) {
        teacherService.deleteTeacherById(id);
    }
}