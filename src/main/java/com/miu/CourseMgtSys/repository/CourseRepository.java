package com.miu.CourseMgtSys.repository;

import com.miu.CourseMgtSys.domain.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
