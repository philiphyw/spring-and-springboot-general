package com.outlook.philiphyw.learn_jpa_hibernate.course.jdbc;

import com.outlook.philiphyw.learn_jpa_hibernate.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {
    @Autowired
    private CourseJdbcRepository courseJdbcRepository;

    @Override
    public void run(String... args) throws Exception {
        courseJdbcRepository.insert(new Course(1, "Learn SpringBoot", "Java Tech"));
        courseJdbcRepository.insert(new Course(2, "Learn Python", "Python Tech"));
        courseJdbcRepository.insert(new Course(3, "Learn Machine Learning", "AI Tech"));

        courseJdbcRepository.deleteById(2);

        System.out.println(courseJdbcRepository.findById(3));
    }
}
