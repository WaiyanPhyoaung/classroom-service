package com.strangers.classroom.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.strangers.classroom.repositories.CourseRepository;

@Component
public class CourseService {
    @Autowired
    private CourseRepository courseRepository;

    public void getALl(){
        courseRepository.findAll().forEach(System.out::println);
    }
}
