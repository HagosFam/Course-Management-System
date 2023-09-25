package com.miu.CourseMgtSys.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseOfferingDayDTO {
    private long Id;
    private Date date;
    private Long instructorId;
    private Long locationId;
}
