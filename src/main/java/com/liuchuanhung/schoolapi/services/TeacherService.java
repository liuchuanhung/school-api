package com.liuchuanhung.schoolapi.services;

import com.liuchuanhung.schoolapi.models.Teacher;

public interface TeacherService {

    Teacher getTeacherById(Long id);
    Teacher createTeacher(Teacher teacher);
    void deleteTeacherById(Long id);
}