package com.outlook.philiphyw.learn_spring_boot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Course> getAllCourses(){

    return Arrays.asList(
          new Course(1,"Learn AWS", "Cloud Tech"),
          new Course(2,"Learn Azure", "Cloud Tech"),
          new Course(3,"Learn Spring Cloud", "Cloud Tech")
//          new Course(4,"Learn Python Basic", "AI Road")
    );
    }
}
