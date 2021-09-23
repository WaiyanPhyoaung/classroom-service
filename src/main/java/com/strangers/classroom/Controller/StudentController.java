package com.strangers.classroom.Controller;


import com.strangers.classroom.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.strangers.classroom.repositories.StudentRepository;

import java.util.List;

@RestController
@RequestMapping("/classroom/v1/api")
@CrossOrigin( origins = "*")
public class StudentController {

    @Autowired
    private StudentRepository userRepository;

    @GetMapping("/studentLists")
    public List<Student> getAll(){
        return userRepository.findAll();

    }

    @GetMapping("/studentLists/{id}")
    public Student getById(@PathVariable int id){
        return userRepository.getById(id);
    }

    @PostMapping("/studentLists")
    public void addStudent( @RequestBody Student student){
        userRepository.save(student);

    }

    @PutMapping("/studentLists")
    public void updateStudent( @RequestBody Student student){
        userRepository.save(student);
    }


    @DeleteMapping("/studentLists/{id}")
    public void deleteStudent(@PathVariable int id){
        userRepository.deleteById(id);
    }
}

