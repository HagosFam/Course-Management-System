package com.miu.CourseMgtSys.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseOfferingDTO {
    private long Id;
    private Date startDate;
    private List<Long> studentsIds;
    private List<Long> courseOfferingDaysIds;
}

