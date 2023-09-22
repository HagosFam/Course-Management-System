package com.miu.CourseMgtSys.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseOfferingDay {
    private Date date;
    private Instructor instructor;
    private Location location;


}
