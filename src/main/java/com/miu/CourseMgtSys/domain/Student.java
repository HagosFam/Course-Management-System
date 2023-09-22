package com.miu.CourseMgtSys.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student extends Person {
    private String studentId;
    private List<CourseOffering> courseOfferingList;

}
