package com.liuchuanhung.schoolapi.services.impl;

import com.liuchuanhung.schoolapi.models.Teacher;
import com.liuchuanhung.schoolapi.repositories.TeacherRepository;
import com.liuchuanhung.schoolapi.services.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherRepository teacherRepository;

    public Teacher getTeacherById(Long id) {
        Optional<Teacher> teacherOptional = teacherRepository.findById(id);
        return (teacherOptional.isPresent()) ? teacherOptional.get(): null;
    }

    public Teacher createTeacher(Teacher teacher) {
        return teacherRepository.save(teacher);
    }

    public void deleteTeacherById(Long id) {
        Teacher teacher = getTeacherById(id);
        if (teacher != null) {
            teacherRepository.deleteById(id);
        }
    }
}