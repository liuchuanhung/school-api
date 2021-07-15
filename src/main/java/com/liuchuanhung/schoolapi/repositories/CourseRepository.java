package com.liuchuanhung.schoolapi.repositories;

import com.liuchuanhung.schoolapi.models.Course;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends PagingAndSortingRepository<Course, Long> {
    List<Course> findByTeacherId(Long teacherId, Pageable pageable);
}