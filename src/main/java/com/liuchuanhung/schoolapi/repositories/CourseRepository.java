package com.liuchuanhung.schoolapi.repositories;

import com.liuchuanhung.schoolapi.models.Course;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends PagingAndSortingRepository<Course, Long> {
}