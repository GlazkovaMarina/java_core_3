package ru.gb;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<Double> grades;
    private String specialty;

    /*
    Имеется список студентов. Каждый студент имеет имя, список оценок и специальность.
Найдите первых 5 студентов специальности "Информатика" с средним баллом выше 4.5, отсортированных по убыванию среднего балла.
В решении не использовать циклы! Только StreamAPI
     */
//   public double getAverageGrade(List<Student> students) {
//       return students.stream().map(Student::getGrades()).filter();
//   }


    public Student(String name, List<Double> grades, String specialty) {
        this.name = name;
        this.grades = grades;
        this.specialty = specialty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Double> getGrades() {
        return grades;
    }

    public void setGrades(List<Double> grades) {
        this.grades = grades;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grades=" + grades +
                ", specialty='" + specialty + '\'' +
                '}';
    }
}
