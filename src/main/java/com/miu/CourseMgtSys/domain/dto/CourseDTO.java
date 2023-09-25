package com.miu.CourseMgtSys.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseDTO {
    List<Long> courseOfferingIds;
    List<Long> preRequisiteIds;
    private long id;
    private String courseId;
    private String name;
    private String description;
    private String goal;
    private String nrOfDays;
    private float price;

}
