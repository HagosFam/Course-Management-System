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
public class Student extends Person {
    @Id
    @GeneratedValue
    private long Id;

    private String studentId;
    @ManyToMany(mappedBy = "students", fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    private List<CourseOffering> courseOfferings;

}
