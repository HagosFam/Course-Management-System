package com.miu.CourseMgtSys.repository;

import com.miu.CourseMgtSys.domain.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long> {

    // distinct join fetch fetchs eagerly, for ManyToOne relationships
    //
    @Query("select c from Course c join fetch c.courseOfferings") // loads all courses with all course offerings
    List<Course> findByCourseNameWithOffering(String name);

    @Query("select c from Course c join fetch c.preRequisite") // leads all courses with pre requisits
   // @Query("select distinct c from Course c join fetch c.preRequisite") to display only distinct values
    List<Course> findByCourseNameWithPreRequisite(String name);
}
