package com.outlook.philiphyw.learn_jpa_hibernate.course.jdbc;

import com.outlook.philiphyw.learn_jpa_hibernate.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private Course course;

    private static final String INSERT_STRING = """
            insert into course(id, name, author)
            values(?,?,?);
            """;

    private static final String DELETE_STRING = """
            delete from course
            where id = ?
            """;

    private static final String SELECT_STRING = """
            select * from course
            where id = ?
            """;

    public void insert(Course course){
        jdbcTemplate.update(INSERT_STRING,course.getId(),course.getName(),course.getAuthor());
    }

    public void deleteById(long id){
        jdbcTemplate.update(DELETE_STRING,id);
    }

    public Course findById(long id){
       return jdbcTemplate.queryForObject(SELECT_STRING, new BeanPropertyRowMapper<>(Course.class),id);
    }
}
