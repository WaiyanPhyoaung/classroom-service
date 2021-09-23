package com.strangers.classroom.entities;

import javax.persistence.*;

@Entity
@Table(name = "teacher")
public class Teacher extends User {

    @Column(name = "education")
    private String education;

    public Teacher() {

    }

    public Teacher(String education) {
        this.education = education;
    }

    public Teacher(int id, String name, String emailAddress, int phoneNumber, String password, String type, String education) {
        super(id, name, emailAddress, phoneNumber, password, type);
        this.education = education;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }
}