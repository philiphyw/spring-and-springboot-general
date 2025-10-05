package com.outlook.philiphyw.learn_jpa_hibernate.course.springdatajpa;

import com.outlook.philiphyw.learn_jpa_hibernate.course.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long> {
    Course findByAuthor(String author);
}
