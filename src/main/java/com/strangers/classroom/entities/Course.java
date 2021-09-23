package com.strangers.classroom.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table (name="course")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "fee")
    private int fee;

    @Column(name = "startDate")
    private Date startDate;

    @Column(name="duration")
    private int duration;

    @Column(name="level")
    private String level;

    @OneToOne
    @JoinColumn(name="teacher_id",referencedColumnName = "id")
    private Teacher teacher;

    @ManyToMany
    private List<Subject> subjects;

    @ManyToMany
    private List<Student> studentList;


}
