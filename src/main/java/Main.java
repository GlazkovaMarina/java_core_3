import ru.gb.Employee;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static public void addSalary(ArrayList<Employee> company, Integer age, Double amount) {
        for (Employee emp : company) {
            if (emp.getAge() > age) {
                emp.setSalary(emp.getSalary() + amount);
            }
        }
    }

    public static void main(String[] args) {

        ArrayList<Employee> company = new ArrayList<>();
        company.add(new Employee("Fedorov", "Egor", "Igorevich", "engineer", "79990001122", 123456.1, "1995-04-18"));
        company.add(new Employee("Petrov", "Petr", "Igorevich", "manager", "79110009900", 100000.0, "1970-08-11"));
        company.add(new Employee("Holina", "Alex", "Petrovna", "accountant", "79123334455", 110000.1, "1976-01-13"));
        company.add(new Employee("Rogova", "Polina", "Nikolaevna", "engineer", "79098889999", 133456.1, "1989-03-15"));
        company.add(new Employee("Volodin", "Anton", "Romovich", "manager", "798977766655", 90200.1, "2000-12-18"));
        for (int i = 0; i < company.size(); i++) {
            System.out.println(company.get(i));
        }
        addSalary(company, 45, 5000.0);
        System.out.println();
        for (int i = 0; i < company.size(); i++) {
            System.out.println(company.get(i));
        }
        System.out.println(company.stream().mapToDouble(Employee::getSalary).average().orElse(0));
        System.out.println(company.stream().mapToDouble(e -> e.getAge()).average().orElse(0));

        List<String> lastnames = company.stream().map(e-> {
            String lastName = e.getLastName();
            lastName.toUpperCase();
            return lastName;
        }).toList();
        System.out.println(lastnames);

    }
}

