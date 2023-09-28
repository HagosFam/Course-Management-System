package com.miu.CourseMgtSys.repository;

import com.miu.CourseMgtSys.domain.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
    // this is a named method query, this searches a student based on its student id and displays its information
    Student findByStudentId(String studentId);
}
