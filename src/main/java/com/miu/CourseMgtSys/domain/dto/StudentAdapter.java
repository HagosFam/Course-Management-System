package com.miu.CourseMgtSys.domain.dto;

import com.miu.CourseMgtSys.domain.entity.CourseOffering;
import com.miu.CourseMgtSys.domain.entity.Student;

import java.util.List;
import java.util.stream.Collectors;

public class StudentAdapter {
    public static StudentDTO toDTO(Student student) {
        StudentDTO dto = new StudentDTO();
        dto.setId(student.getId());
        dto.setStudentId(student.getStudentId());

        // Extract courseOffering IDs from the Student entity
        List<Long> courseOfferingIds = student.getCourseOfferings()
                .stream()
                .map(CourseOffering::getId)
                .collect(Collectors.toList());
        dto.setCourseOfferingsIds(courseOfferingIds);

        // Set other properties inherited from PersonDTO
        dto.setName(student.getName());
        dto.setPhone(student.getPhone());
        dto.setEmail(student.getEmail());

        // Extract address ID from the Person entity
        if (student.getAddress() != null) {
            dto.setAddressId(student.getAddress().getId());
        }

        return dto;
    }

    public static Student toEntity(StudentDTO dto) {
        Student entity = new Student();
        entity.setId(dto.getId());
        entity.setStudentId(dto.getStudentId());

        // You may need to set the actual CourseOffering entities based on the provided IDs
        // Assuming you have methods to retrieve them
        List<CourseOffering> courseOfferings = dto.getCourseOfferingsIds()
                .stream()
                .map(courseOfferingId -> retrieveCourseOfferingById(courseOfferingId))
                .collect(Collectors.toList());
        entity.setCourseOfferings(courseOfferings);

        // Set other properties inherited from PersonDTO
        entity.setName(dto.getName());
        entity.setPhone(dto.getPhone());
        entity.setEmail(dto.getEmail());

        // You may need to set the actual Address entity based on the provided ID
        // Assuming you have a method to retrieve it
      //  entity.setAddress(retrieveCourseOfferingById(dto.getAddressId()));

        return entity;
    }

    public static List<StudentDTO> toDTOList(List<Student> students) {
        return students.stream()
                .map(StudentAdapter::toDTO)
                .collect(Collectors.toList());
    }

    public static List<Student> toEntityList(List<StudentDTO> dtos) {
        return dtos.stream()
                .map(StudentAdapter::toEntity)
                .collect(Collectors.toList());
    }

    // Additional methods may be needed for other conversions or customization

    // Method to retrieve a CourseOffering entity by ID (simulated)
    private static CourseOffering retrieveCourseOfferingById(Long courseOfferingId) {
        // Simulated retrieval logic
        CourseOffering courseOffering = new CourseOffering();
        courseOffering.setId(courseOfferingId);
        // Set other properties as needed
        return courseOffering;
    }
}
