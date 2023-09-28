package com.miu.CourseMgtSys.repository;

import com.miu.CourseMgtSys.domain.entity.CourseOffering;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseOfferingRepository extends JpaRepository<CourseOffering, Long> {
}
