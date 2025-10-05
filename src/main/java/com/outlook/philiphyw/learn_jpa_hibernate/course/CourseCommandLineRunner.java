package com.outlook.philiphyw.learn_jpa_hibernate.course;

import com.outlook.philiphyw.learn_jpa_hibernate.course.jdbc.CourseJdbcRepository;
import com.outlook.philiphyw.learn_jpa_hibernate.course.jpa.CourseJpaRepository;
import com.outlook.philiphyw.learn_jpa_hibernate.course.springdatajpa.CourseSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {
    @Autowired
    private CourseJdbcRepository courseJdbcRepository;

    @Autowired
    private CourseJpaRepository courseJpaRepository;

    @Autowired
    private CourseSpringDataJpaRepository courseSpringDataJpaRepository;

    @Override
    public void run(String... args) throws Exception {
        courseJdbcRepository.insert(new Course(1, "Learn SpringBoot", "Java Tech"));
        courseJdbcRepository.insert(new Course(2, "Learn Python", "Python Tech"));
        courseJdbcRepository.deleteById(2);
        System.out.println(courseJdbcRepository.findById(1));

        this.courseJpaRepository.insert(new Course(3,"Learn Spring JPA", "Java Tech"));
        System.out.printf("Find by JPA EntityManager: %s%n",this.courseJpaRepository.findById(3));

        this.courseSpringDataJpaRepository.save( new Course(4, "Learn Machine Learning", "AI Tech"));

        List<Course> springDataJpaCourseList = new ArrayList<Course>(Arrays.asList(
                new Course(5, "Learn Big Data", "AI Tech"),
                new Course(6, "Hack or Be Hacked", "Cloud Security"),
                new Course(7, "Learn Large Language Model", "AI Tech")
        ));
        this.courseSpringDataJpaRepository.saveAll(springDataJpaCourseList);
        System.out.printf("Spring Data JPA findByAuthor: %s", this.courseSpringDataJpaRepository.findByAuthor("Cloud Security"));
    }
}
