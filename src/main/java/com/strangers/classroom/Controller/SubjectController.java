package com.strangers.classroom.Controller;

import com.strangers.classroom.entities.Subject;
import com.strangers.classroom.repositories.SubjectRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/classroom/v1/api")
@CrossOrigin( origins = "*")
public class SubjectController {

    private final SubjectRepository subjectRepository;

    public SubjectController(SubjectRepository subjectRepository) {
        this.subjectRepository = subjectRepository;
    }

    @GetMapping("/subjectLists")
    public List<Subject> getAll() {
        return subjectRepository.findAll();
    }

    @GetMapping("/subjectLists/{id}")
    public Subject getById(@PathVariable int id) {
        return subjectRepository.getById(id);
    }

    @PostMapping("/subjectLists")
    public void addCourse(@RequestBody Subject subject) {
        subjectRepository.save(subject);
    }

    @PutMapping("/subjectLists")
    public void updateCourse(@RequestBody Subject subject) {
        subjectRepository.save(subject);
    }


    @DeleteMapping("/subjectLists/{id}")
    public void deleteSubject(@PathVariable int id) {
        subjectRepository.deleteById(id);
    }
}
