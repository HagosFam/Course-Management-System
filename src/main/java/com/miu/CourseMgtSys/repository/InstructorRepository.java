package com.miu.CourseMgtSys.repository;

import com.miu.CourseMgtSys.domain.entity.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface InstructorRepository extends JpaRepository<Instructor, Long> {
    // loading the related object using join fetch

    // loads the list of course offerings that the instructor have
    @Query("select i from Instructor i join fetch i.courseOfferingDayList")
    List<Instructor> findByInstructorId(String studentId);


}
