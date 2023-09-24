package com.miu.CourseMgtSys.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class CourseOffering {
    @Id
    @GeneratedValue
    private long Id;
    private Date startDate;

    @ManyToMany(mappedBy = "course_offering_student")
    @JoinColumn(name = "course_offering_student")
    private List<Student> studentList = new ArrayList<>();
    @OneToMany
    @JoinColumn(name = "course_offering_course_offering_days")
    private List<CourseOfferingDay> courseOfferingDays = new ArrayList<>();
}
