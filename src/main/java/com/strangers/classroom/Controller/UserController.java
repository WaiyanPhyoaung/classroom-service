package com.strangers.classroom.Controller;


import com.strangers.classroom.entities.User;
import com.strangers.classroom.repositories.UserRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/classroom/v1/api")
@CrossOrigin( origins = "*")
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/userLists")
    public List<User> getAll(){
        List<User> all = userRepository.findAll();
        all.forEach(System.out::println);
        return all;
    }
}
