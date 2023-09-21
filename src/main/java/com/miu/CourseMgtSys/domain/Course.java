package com.miu.CourseMgtSys.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Course {
    private String courseId;
    private String name;
    private String description;
    private String goal;
    private String nrOfDays;
    private float price;
    private List<Course> preRequisite;
   private List<CourseOffering> courseOfferings;
}
