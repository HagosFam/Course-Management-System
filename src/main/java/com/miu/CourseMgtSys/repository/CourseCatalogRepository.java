package com.miu.CourseMgtSys.repository;

import com.miu.CourseMgtSys.domain.entity.CourseCatalog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseCatalogRepository extends JpaRepository<CourseCatalog, Long> {
    CourseCatalog findByIdOrCourseCatalogName(Long id, String name);

    // course catalog contains list of courses, then, i used courseLists (multipele) + id
    CourseCatalog findByCousreListsCourseId(String courseId);
}
