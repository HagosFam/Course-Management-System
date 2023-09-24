package com.miu.CourseMgtSys.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class CourseOfferingDay {
    @Id
    @GeneratedValue
    private long Id;
    private Date date;

    @ManyToOne
    @JoinColumn(name = "course_offering_instructor")
    private Instructor instructor;

    @ManyToOne
    @JoinColumn(name = "course_offering_location")
    private Location location;


}
