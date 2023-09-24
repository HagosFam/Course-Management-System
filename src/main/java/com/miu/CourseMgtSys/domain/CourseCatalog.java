package com.miu.CourseMgtSys.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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

    @OneToMany
    @JoinColumn(name = "course_catalog_course")
    private List<Course> courseList = new ArrayList<>();

    // search course method
//    public static Course searchCourse(String courseId) {
//       for (Course course:courseList){
//           if(course.getCourseId().equals(courseId)) {
//               return course;
//           }
//       }
//       return null;
//    }
}
