package ru.gb;

/*
Создать класс ”Сотрудник” с полями: ФИО, должность, телефон,
зарплата, возраст;
 */

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Employee {
    private String lastName;
    private String firstName;
    private String fathersName;
    private String position;
    private String number;
    private Double salary;
    private LocalDate birth;


    public Employee(String lastName, String firstName, String fathersName, String position, String number, Double salary, String birth) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.fathersName = fathersName;
        this.position = position;
        this.number = number;
        this.salary = salary;
        this.birth = LocalDate.parse(birth);
    }

    public String getLastName() {
        return lastName;
    }

    public String setLastName(String lastName) {
        this.lastName = lastName;
        return lastName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", fathersName='" + fathersName + '\'' +
                ", position='" + position + '\'' +
                ", number='+" + number + '\'' +
                ", salary=" + salary +
                ", birth=" + birth +
                '}';
    }
    public String print(){
        return String.format("Сотрудник: Фамилия - %s, Имя - %s, Отчество - %s, Должность - %s, Возраст - %d, Зарплата - %lf, Телефон - +%s",
                lastName, firstName, fathersName, position, getAge(), salary, number);
    }

    public String getFirstName() {
        return firstName;
    }

    public String setFirstName(String firstName) {
        this.firstName = firstName;
        return firstName;
    }

    public String getFathersName() {
        return fathersName;
    }

    public String setFathersName(String fathersName) {
        this.fathersName = fathersName;
        return fathersName;
    }

    public String getPosition() {
        return position;
    }

    public String setPosition(String position) {
        this.position = position;
        return position;
    }

    public String getNumber() {
        return '+' + number;
    }

    public String setNumber(String number) {
        this.number = number;
        return number;
    }

    public Double getSalary() {
        return salary;
    }

    public Double setSalary(Double salary) {
        this.salary = salary;
        return salary;
    }

    public Integer getAge() {
        return Period.between(birth, LocalDate.now()).getYears();
    }

    public LocalDate setBirth(LocalDate birth) {
        this.birth = birth;
        return birth;
    }
    public LocalDate getBirth() {
        return birth;
    }

    static public void compare(List<Employee> people){
        people.stream()
                .collect(Collectors.groupingBy(Employee::getBirth))
                .forEach((birth, peopleWithSameBirth) -> {
                    if (peopleWithSameBirth.size() > 1) {
                        System.out.printf("People with identical Birth %s are : %s%n", birth, peopleWithSameBirth);
                    }
                });
    }



}
