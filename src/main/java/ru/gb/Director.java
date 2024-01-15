package ru.gb;

import java.util.ArrayList;

public class Director extends Employee{

    public Director(String lastName, String firstName, String fathersName, String position, String number, Double salary, String birth) {
        super(lastName, firstName, fathersName, position, number, salary, birth);
    }

    static public void addSalary(ArrayList<Employee> company, Integer age, Double amount) {
        for (Employee emp : company) {
            if ((emp.getAge() > age) && (emp.getClass() != Director.class)) {
                emp.setSalary(emp.getSalary() + amount);
            }
        }
    }
}
