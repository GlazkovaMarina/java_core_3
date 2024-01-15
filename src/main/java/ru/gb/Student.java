package ru.gb;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Student {
    private String name;
    private List<Double> grades;
    private String specialty;
    public Student(String name, List<Double> grades, String specialty) {
        this.name = name;
        this.grades = grades;
        this.specialty = specialty;
    }


   public Double getAverageGrade() {
       Double avr = 0.0;
       for (Double g: grades){
           avr = avr + g;
       }
       return avr/grades.size();
   }

    public static List<Student> getAverageGradeInf(List<Student> students) {
        return students.stream().filter(e-> e.getAverageGrade() > 4.5).filter(e-> e.getSpecialty().equals("Информатика")).sorted(Comparator.comparingDouble(Student::getAverageGrade).reversed()).limit(5).toList();
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
