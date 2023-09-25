package com.miu.CourseMgtSys.domain.dto;

import com.miu.CourseMgtSys.domain.entity.CourseOffering;
import com.miu.CourseMgtSys.domain.entity.CourseOfferingDay;
import com.miu.CourseMgtSys.domain.entity.Student;

import java.util.List;
import java.util.stream.Collectors;

public class CourseOfferingAdapter {
    public static CourseOfferingDTO toDTO(CourseOffering courseOffering) {
        CourseOfferingDTO dto = new CourseOfferingDTO();
        dto.setId(courseOffering.getId());
        dto.setStartDate(courseOffering.getStartDate());

        // Extract student IDs from the CourseOffering entity
        List<Long> studentIds = courseOffering.getStudents()
                .stream()
                .map(Student::getId)
                .collect(Collectors.toList());
        dto.setStudentsIds(studentIds);

        // Extract courseOfferingDay IDs from the CourseOffering entity
        List<Long> courseOfferingDaysIds = courseOffering.getCourseOfferingDays()
                .stream()
                .map(CourseOfferingDay::getId)
                .collect(Collectors.toList());
        dto.setCourseOfferingDaysIds(courseOfferingDaysIds);

        return dto;
    }

    public static CourseOffering toEntity(CourseOfferingDTO dto) {
        CourseOffering entity = new CourseOffering();
        entity.setId(dto.getId());
        entity.setStartDate(dto.getStartDate());

        // You may need to set the actual Student entities based on the provided IDs
        // Assuming you have methods to retrieve them
        List<Student> students = dto.getStudentsIds()
                .stream()
                .map(studentId -> retrieveStudentById(studentId))
                .collect(Collectors.toList());
        entity.setStudents(students);

        // You may need to set the actual CourseOfferingDay entities based on the provided IDs
        // Assuming you have methods to retrieve them
        List<CourseOfferingDay> courseOfferingDays = dto.getCourseOfferingDaysIds()
                .stream()
                .map(courseOfferingDayId -> retrieveCourseOfferingDayById(courseOfferingDayId))
                .collect(Collectors.toList());
        entity.setCourseOfferingDays(courseOfferingDays);

        return entity;
    }

    public static List<CourseOfferingDTO> toDTOList(List<CourseOffering> courseOfferings) {
        return courseOfferings.stream()
                .map(CourseOfferingAdapter::toDTO)
                .collect(Collectors.toList());
    }

    public static List<CourseOffering> toEntityList(List<CourseOfferingDTO> dtos) {
        return dtos.stream()
                .map(CourseOfferingAdapter::toEntity)
                .collect(Collectors.toList());
    }

    // Additional methods may be needed for other conversions or customization

    // Method to retrieve a Student entity by ID (simulated)
    private static Student retrieveStudentById(Long studentId) {
        // Simulated retrieval logic
        Student student = new Student();
        student.setId(studentId);
        student.setName("StudentName" + studentId); // Set other properties as needed
        return student;
    }

    // Method to retrieve a CourseOfferingDay entity by ID (simulated)
    private static CourseOfferingDay retrieveCourseOfferingDayById(Long courseOfferingDayId) {
        // Simulated retrieval logic
        CourseOfferingDay courseOfferingDay = new CourseOfferingDay();
        courseOfferingDay.setId(courseOfferingDayId);
        // Set other properties as needed
        return courseOfferingDay;
    }
}
