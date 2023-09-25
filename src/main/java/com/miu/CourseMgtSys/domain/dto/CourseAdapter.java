package com.miu.CourseMgtSys.domain.dto;

import com.miu.CourseMgtSys.domain.entity.Course;
import com.miu.CourseMgtSys.domain.entity.CourseOffering;

import java.util.List;
import java.util.stream.Collectors;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CourseAdapter {
    private static Map<Long, CourseOffering> courseOfferingMap = new HashMap<>();
    private static Map<Long, Course> courseMap = new HashMap<>();

    // Assuming you have a method to generate unique IDs for entities
    private static long courseIdCounter = 1L;
    private static long courseOfferingIdCounter = 1L;

    public static CourseDTO toDTO(Course course) {
        CourseDTO courseDTO = new CourseDTO();
        courseDTO.setId(course.getId());
        courseDTO.setCourseId(course.getCourseId());
        courseDTO.setName(course.getName());
        courseDTO.setDescription(course.getDescription());
        courseDTO.setGoal(course.getGoal());
        courseDTO.setNrOfDays(course.getNrOfDays());
        courseDTO.setPrice(course.getPrice());

        // Extract courseOffering IDs from the Course entities
        List<Long> courseOfferingIds = course.getCourseOfferings()
                .stream()
                .map(CourseOffering::getId)
                .collect(Collectors.toList());
        courseDTO.setCourseOfferingIds(courseOfferingIds);

        // Extract preRequisite IDs from the Course entities
        List<Long> preRequisiteIds = course.getPreRequisite()
                .stream()
                .map(Course::getId)
                .collect(Collectors.toList());
        courseDTO.setPreRequisiteIds(preRequisiteIds);

        return courseDTO;
    }

    public static Course toEntity(CourseDTO courseDTO) {
        Course course = new Course();
        course.setId(courseDTO.getId());
        course.setCourseId(courseDTO.getCourseId());
        course.setName(courseDTO.getName());
        course.setDescription(courseDTO.getDescription());
        course.setGoal(courseDTO.getGoal());
        course.setNrOfDays(courseDTO.getNrOfDays());
        course.setPrice(courseDTO.getPrice());

        // You may need to fetch and set the actual CourseOffering entities based on the IDs
        // Assuming you have a method to retrieve CourseOffering entities by their IDs
        List<CourseOffering> courseOfferings = courseDTO.getCourseOfferingIds()
                .stream()
                .map(courseOfferingId -> retrieveCourseOfferingById(courseOfferingId))
                .collect(Collectors.toList());
        course.setCourseOfferings(courseOfferings);

        // You may need to fetch and set the actual preRequisite Course entities based on the IDs
        // Assuming you have a method to retrieve Course entities by their IDs
        List<Course> preRequisite = courseDTO.getPreRequisiteIds()
                .stream()
                .map(preRequisiteId -> retrieveCourseById(preRequisiteId))
                .collect(Collectors.toList());
        course.setPreRequisite(preRequisite);

        return course;
    }
    public static List<CourseDTO> toDTOList(List<Course> courses) {
        return courses.stream()
                .map(CourseAdapter::toDTO)
                .collect(Collectors.toList());
    }

    public static CourseOffering retrieveCourseOfferingById(Long courseOfferingId) {
        return courseOfferingMap.get(courseOfferingId);
    }

    public static Course retrieveCourseById(Long courseId) {
        return courseMap.get(courseId);
    }

    // Additional methods may be needed for other conversions or customization

    // Method to add a CourseOffering to the in-memory storage
    public static void addCourseOffering(CourseOffering courseOffering) {
        courseOffering.setId(courseOfferingIdCounter++);
        courseOfferingMap.put(courseOffering.getId(), courseOffering);
    }

    // Method to add a Course to the in-memory storage
    public static void addCourse(Course course) {
        course.setId(courseIdCounter++);
        courseMap.put(course.getId(), course);
    }
}
