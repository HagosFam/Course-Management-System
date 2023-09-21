package com.miu.CourseMgtSys.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Instructor extends Person {
    private String instructorId;
    private List<CourseOfferingDay> courseOfferingDayList;

}
