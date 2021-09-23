package com.strangers.classroom.Controller;


import com.strangers.classroom.entities.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.strangers.classroom.repositories.TeacherRepository;

import java.util.List;

@RestController
@RequestMapping("/classroom/v1/api")
@CrossOrigin( origins = "*")
public class TeacherController {

    @Autowired
    private TeacherRepository userRepository;

    @GetMapping("/teacherLists")
    public List<Teacher> getAll(){
        return userRepository.findAll();
    }

    @GetMapping("/teacherLists/{id}")
    public Teacher getById(@PathVariable int id){
        return userRepository.getById(id);
    }

    @PostMapping("/teacherLists")
    public void addTeacher( @RequestBody Teacher teacher){
        userRepository.save(teacher);
    }
    @PutMapping("/teacherLists")
    public void updateTeacher( @RequestBody Teacher teacher){
        userRepository.save(teacher);
    }


    @DeleteMapping("/teacherLists/{id}")
    public void deleteTeacher(@PathVariable int id){
        userRepository.deleteById(id);
    }
}

