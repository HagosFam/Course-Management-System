package com.miu.CourseMgtSys.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseOffering {
    private Date startDate;
   private List<Student> studentList;
   private List<CourseOfferingDay> courseOfferingDays;
}
