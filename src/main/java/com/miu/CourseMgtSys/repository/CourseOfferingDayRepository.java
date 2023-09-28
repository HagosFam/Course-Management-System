package com.miu.CourseMgtSys.repository;

import com.miu.CourseMgtSys.domain.entity.CourseOfferingDay;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface CourseOfferingDayRepository extends JpaRepository<CourseOfferingDay, Long> {

    // loads all inforamtion including @ManytoOne relation.
    // it is directly loaded this way
    List<CourseOfferingDay> findByDate(Date date); // this gives all course offering days with all instructors
}
