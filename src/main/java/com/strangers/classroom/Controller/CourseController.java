package com.strangers.classroom.Controller;


import com.strangers.classroom.entities.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.strangers.classroom.repositories.CourseRepository;

import java.util.List;

@RestController
@RequestMapping("/classroom/v1/api")
@CrossOrigin(origins = "*")
public class CourseController {

    @Autowired
    private CourseRepository courseRepository;

    @GetMapping("/courseLists")
    public List<Course> getAll() {
        List<Course> all = courseRepository.findAll();
        return all;
    }

    @GetMapping("/courseLists/{id}")
    public Course getById(@PathVariable int id) {
        return courseRepository.getById(id);
    }

    @PostMapping("/courseLists")
    public void addCourse(@RequestBody Course course) {
        courseRepository.save(course);
    }

    @PutMapping("/courseLists")
    public void updateCourse(@RequestBody Course course) {
        courseRepository.save(course);
    }


    @DeleteMapping("/courseLists/{id}")
    public void deleteCourse(@PathVariable int id) {
        courseRepository.deleteById(id);
    }
}

