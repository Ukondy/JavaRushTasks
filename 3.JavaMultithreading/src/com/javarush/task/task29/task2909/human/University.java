package com.javarush.task.task29.task2909.human;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class University {
    private int age;
    private String name;
    private List<Student> students = new ArrayList<>();

    public University(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public Student getStudentWithAverageGrade(double averageGrade) {
        return students.stream().filter(s -> s.getAverageGrade() == averageGrade).findFirst().get();
    }

    public Student getStudentWithMaxAverageGrade() {
        return students.stream().max(Comparator.comparingDouble(Student::getAverageGrade)).get();
    }

    public Student getStudentWithMinAverageGrade() {
        return students.stream().min(Comparator.comparingDouble(Student::getAverageGrade)).get();
    }

    public void expel(Student student) {
        students.removeIf(s -> s.equals(student));
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}