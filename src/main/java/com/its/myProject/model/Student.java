package com.its.myProject.model;

import java.time.LocalDate;

public class Student {
    private Integer id;
    private String name;
    private String surname;
    private LocalDate dob;
    private Integer age;

    public Student(Integer id, String name, String surname, LocalDate dob, Integer age) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.dob = dob;
        this.age = age;
    }

    public Student(String name, String surname, LocalDate dob, Integer age) {
        this.name = name;
        this.surname = surname;
        this.dob = dob;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
