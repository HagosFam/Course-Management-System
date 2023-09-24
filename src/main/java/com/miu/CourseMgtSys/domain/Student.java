package com.miu.CourseMgtSys.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Student extends Person {
    @Id
    @GeneratedValue
    private long Id;

    private String studentId;
    @ManyToMany
    @JoinTable(name = "student_offering",
            joinColumns = {@JoinColumn(name = "Student_Id")},
            inverseJoinColumns = {@JoinColumn(name = "Course_Offering_Id")})
    private List<CourseOffering> courseOfferingList = new ArrayList<>();

}
