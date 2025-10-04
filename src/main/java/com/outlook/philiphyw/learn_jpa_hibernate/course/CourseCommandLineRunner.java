package com.outlook.philiphyw.learn_jpa_hibernate.course;

import com.outlook.philiphyw.learn_jpa_hibernate.course.jdbc.CourseJdbcRepository;
import com.outlook.philiphyw.learn_jpa_hibernate.course.jpa.CourseJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {
    @Autowired
    private CourseJdbcRepository courseJdbcRepository;

    @Autowired
    private CourseJpaRepository courseJpaRepository;

    @Override
    public void run(String... args) throws Exception {
        courseJdbcRepository.insert(new Course(1, "Learn SpringBoot", "Java Tech"));
        courseJdbcRepository.insert(new Course(2, "Learn Python", "Python Tech"));
        courseJdbcRepository.insert(new Course(3, "Learn Machine Learning", "AI Tech"));

        courseJdbcRepository.deleteById(2);

        System.out.println(courseJdbcRepository.findById(3));

        this.courseJpaRepository.insert(new Course(4,"Learn Spring JPA", "Java Tech"));

        System.out.printf("Find by JPA EntityManager: %s%n",this.courseJpaRepository.findById(1));
    }
}
