package com.miu.CourseMgtSys.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Fetch;

import java.util.ArrayList;
import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class CourseCatalog {
    @Id
    @GeneratedValue
    private long id;
    private String courseCatalogName;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "course_catalog_course")
    private List<Course> courseList = new ArrayList<>();

}
