package com.strangers.classroom.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table ( name = "student")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Student extends User {

    @Column(name = "registrationNumber")
    private int registrationNumber;

   @ManyToMany(mappedBy = "studentList")
    private List<Course> courseList = new ArrayList<>();
}
