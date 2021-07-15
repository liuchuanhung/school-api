package com.liuchuanhung.schoolapi.repositories;

import com.liuchuanhung.schoolapi.models.Teacher;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends PagingAndSortingRepository<Teacher, Long> {
}