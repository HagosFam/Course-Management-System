package com.miu.CourseMgtSys.domain.dto;

import com.miu.CourseMgtSys.domain.entity.Course;
import com.miu.CourseMgtSys.domain.entity.CourseCatalog;

import java.util.List;
import java.util.stream.Collectors;

public class CourseCatalogAdapter {

    public static CourseCatalogDTO toDTO(CourseCatalog courseCatalog) {
        CourseCatalogDTO courseCatalogDTO = new CourseCatalogDTO();
        courseCatalogDTO.setId(courseCatalog.getId());
        courseCatalogDTO.setCourseCatalogName(courseCatalog.getCourseCatalogName());

        // Extract course IDs from the Course entities
        List<Long> courseListIds = courseCatalog.getCourseList()
                .stream()
                .map(Course::getId)
                .collect(Collectors.toList());
        courseCatalogDTO.setCourseListId(courseListIds);
        return courseCatalogDTO;
    }

    public static CourseCatalog toEntity(CourseCatalogDTO courseCatalogDTO) {
        CourseCatalog courseCatalog = new CourseCatalog();
        courseCatalog.setId(courseCatalogDTO.getId());
        courseCatalog.setCourseCatalogName(courseCatalogDTO.getCourseCatalogName());

        // You may need to fetch and set the actual Course entities based on the IDs
        // Assuming you have a method to retrieve Course entities by their IDs
        List<Course> courseList = courseCatalogDTO.getCourseListId()
                .stream()
                .map(courseId -> retrieveCourseById(courseId))
                .collect(Collectors.toList());
        courseCatalog.setCourseList(courseList);

        return courseCatalog;
    }

    // Additional methods may be needed for other conversions or customization
    public static List<CourseCatalogDTO> getCourseCatalogDTOsFromCourseCatalogs(List<CourseCatalog> courseCatalogs) {
        return courseCatalogs.stream()
                .map(CourseCatalogAdapter::toDTO)
                .collect(Collectors.toList());
    }

    public static Course retrieveCourseById(Long courseId) {
        // You should implement your own logic here to fetch the Course by ID from your data source (e.g., database)
        // For example, if you're using Spring Data JPA, you can use JpaRepository's findById method
        Course courseOptional = new Course();

        // Check if the Course with the given ID exists
//        if (courseOptional.getCourseId() !=null) {
//            return courseOptional.getId();
//        } else {
//            // Handle the case where the Course does not exist
//            // You can throw an exception or return null, depending on your application's requirements
//            throw new EntityNotFoundException("Course not found with ID: " + courseId);
//        }
        return courseOptional;
    }
}
