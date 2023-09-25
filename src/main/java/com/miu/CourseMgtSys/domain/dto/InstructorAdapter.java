package com.miu.CourseMgtSys.domain.dto;

import com.miu.CourseMgtSys.domain.entity.CourseOfferingDay;
import com.miu.CourseMgtSys.domain.entity.Instructor;

import java.util.List;
import java.util.stream.Collectors;

public class InstructorAdapter {
    public static InstructorDTO toDTO(Instructor instructor) {
        InstructorDTO dto = new InstructorDTO();
        dto.setId(instructor.getId());
        dto.setInstructorId(instructor.getInstructorId());

        // Extract courseOfferingDayList IDs from the Instructor entity
        List<Long> courseOfferingDayListIds = instructor.getCourseOfferingDayList()
                .stream()
                .map(CourseOfferingDay::getId)
                .collect(Collectors.toList());
        dto.setCourseOfferingDayListIds(courseOfferingDayListIds);

        // Set other properties inherited from PersonDTO
        dto.setName(instructor.getName());
        // Add other properties as needed

        return dto;
    }

    public static Instructor toEntity(InstructorDTO dto) {
        Instructor entity = new Instructor();
        entity.setId(dto.getId());
        entity.setInstructorId(dto.getInstructorId());

        // You may need to set the actual CourseOfferingDay entities based on the provided IDs
        // Assuming you have methods to retrieve them
        List<CourseOfferingDay> courseOfferingDayList = dto.getCourseOfferingDayListIds()
                .stream()
                .map(courseOfferingDayId -> retrieveCourseOfferingDayById(courseOfferingDayId))
                .collect(Collectors.toList());
        entity.setCourseOfferingDayList(courseOfferingDayList);

        // Set other properties inherited from Person
        entity.setName(dto.getName());
        // Add other properties as needed

        return entity;
    }

    public static List<InstructorDTO> toDTOList(List<Instructor> instructors) {
        return instructors.stream()
                .map(InstructorAdapter::toDTO)
                .collect(Collectors.toList());
    }

    public static List<Instructor> toEntityList(List<InstructorDTO> dtos) {
        return dtos.stream()
                .map(InstructorAdapter::toEntity)
                .collect(Collectors.toList());
    }

    // Additional methods may be needed for other conversions or customization

    // Method to retrieve a CourseOfferingDay entity by ID (simulated)
    private static CourseOfferingDay retrieveCourseOfferingDayById(Long courseOfferingDayId) {
        // Simulated retrieval logic
        CourseOfferingDay courseOfferingDay = new CourseOfferingDay();
        courseOfferingDay.setId(courseOfferingDayId);
        // Set other properties as needed
        return courseOfferingDay;
    }
}

