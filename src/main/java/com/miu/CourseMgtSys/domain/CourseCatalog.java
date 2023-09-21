package com.miu.CourseMgtSys.domain;

import java.util.List;

public class CourseCatalog {
    private List<Course> courseList;

    // search course method
    public Course searchCourse(String courseId) {
       for (Course course:courseList){
           if(course.getCourseId().equals(courseId)) {
               return course;
           }
       }
       return null;
    }
}
