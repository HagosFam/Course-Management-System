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
public class Instructor extends Person {
    @Id
    @GeneratedValue
    private long Id;
    private String instructorId;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "instructor_offering_day")
    private List<CourseOfferingDay> courseOfferingDayList = new ArrayList<>();

}
