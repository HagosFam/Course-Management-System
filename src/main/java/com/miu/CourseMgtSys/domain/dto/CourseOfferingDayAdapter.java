package com.miu.CourseMgtSys.domain.dto;

import com.miu.CourseMgtSys.domain.entity.CourseOfferingDay;
import com.miu.CourseMgtSys.domain.entity.Instructor;
import com.miu.CourseMgtSys.domain.entity.Location;

import java.util.List;
import java.util.stream.Collectors;

public class CourseOfferingDayAdapter {
    public static CourseOfferingDayDTO toDTO(CourseOfferingDay courseOfferingDay) {
        CourseOfferingDayDTO dto = new CourseOfferingDayDTO();
        dto.setId(courseOfferingDay.getId());
        dto.setDate(courseOfferingDay.getDate());
        if (courseOfferingDay.getInstructor() != null) {
            dto.setInstructorId(courseOfferingDay.getInstructor().getId());
        }
        if (courseOfferingDay.getLocation() != null) {
            dto.setLocationId(courseOfferingDay.getLocation().getId());
        }
        return dto;
    }

    public static CourseOfferingDay toEntity(CourseOfferingDayDTO dto) {
        CourseOfferingDay entity = new CourseOfferingDay();
        entity.setId(dto.getId());
        entity.setDate(dto.getDate());
        // You may need to set the Instructor and Location entities based on the provided IDs
        // Assuming you have methods to retrieve them
        entity.setInstructor(retrieveInstructorById(dto.getInstructorId()));
        entity.setLocation(retrieveLocationById(dto.getLocationId()));
        return entity;
    }

    public static List<CourseOfferingDayDTO> toDTOList(List<CourseOfferingDay> courseOfferingDays) {
        return courseOfferingDays.stream()
                .map(CourseOfferingDayAdapter::toDTO)
                .collect(Collectors.toList());
    }

    public static List<CourseOfferingDay> toEntityList(List<CourseOfferingDayDTO> dtos) {
        return dtos.stream()
                .map(CourseOfferingDayAdapter::toEntity)
                .collect(Collectors.toList());
    }

    // Additional methods may be needed for other conversions or customization

    // Method to retrieve an Instructor entity by ID (simulated)
    // Simulated retrieval logic for Instructor entity
    private static Instructor retrieveInstructorById(Long instructorId) {
        // Simulate retrieval by creating a new Instructor with the provided ID
        Instructor instructor = new Instructor();
        instructor.setId(instructorId);
        instructor.setName(instructor.getName()); // Set other properties as needed
        return instructor;
    }

    // Simulated retrieval logic for Location entity
    private static Location retrieveLocationById(Long locationId) {
        // Simulate retrieval by creating a new Location with the provided ID
        Location location = new Location();
        location.setId(locationId);
        location.setAddress(location.getAddress());
        return location;
    }
}
