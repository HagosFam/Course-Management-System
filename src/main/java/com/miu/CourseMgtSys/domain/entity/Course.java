package com.miu.CourseMgtSys.domain.entity;

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
public class Course {
    @Id
    @GeneratedValue
    private long id;
    private String courseId;
    @Column(name = "courseName", length = 255, nullable = false) // course name will have this specifications
    private String name;
    private String description;
    private String goal;
    private String nrOfDays;
    private float price;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "course_prerequisite_id")
    private List<Course> preRequisite = new ArrayList<>();
    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "course_course_offering")
   private List<CourseOffering> courseOfferings = new ArrayList<>();
}
