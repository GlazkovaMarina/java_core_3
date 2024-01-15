import ru.gb.Director;
import ru.gb.Employee;
import ru.gb.Student;

import java.util.ArrayList;
import java.util.List;

public class Main {


    // 1. Написать прототип компаратора - метод внутри класса сотрудника, сравнивающий две даты, представленные в виде трёх чисел гггг-мм-дд, без использования условного оператора.
    //

    public static void main(String[] args) {

        ArrayList<Employee> company = new ArrayList<>();
        company.add(new Employee("Fedorov", "Egor", "Igorevich", "engineer", "79990001122", 123456.1, "1989-03-15"));
        company.add(new Employee("Petrov", "Petr", "Igorevich", "manager", "79110009900", 100000.0, "1970-08-11"));
        company.add(new Employee("Holina", "Alex", "Petrovna", "accountant", "79123334455", 110000.1, "1976-01-13"));
        company.add(new Employee("Rogova", "Polina", "Nikolaevna", "engineer", "79098889999", 133456.1, "1989-03-15"));
        company.add(new Employee("Volodin", "Anton", "Romovich", "manager", "798977766655", 90200.1, "2000-12-18"));
        company.add(new Director("Gordin", "Mick", "Olegovich", "director", "79990000000", 190000.2, "1972-11-09"));



        for (int i = 0; i < company.size(); i++) {
            System.out.println(company.get(i));
        }
        Director.addSalary(company, 0, 5000.0);
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

        Employee.compare(company);

        ArrayList<Integer> fD = new ArrayList<>();
        fD.add(2021);
        fD.add(11);
        fD.add(2);
        ArrayList<Integer> sD = new ArrayList<>();
        sD.add(2021);
        sD.add(12);
        sD.add(19);
        ArrayList<Integer> tD = new ArrayList<>();
        tD.add(2021);
        tD.add(9);
        tD.add(24);
        ArrayList<Integer> fsD = new ArrayList<>();
        fsD.add(2021);
        fsD.add(11);
        fsD.add(2);

        System.out.println(Employee.comparator(fD,sD));
        System.out.println(Employee.comparator(fD,tD));
        System.out.println(Employee.comparator(fD,fsD));

        ArrayList<Double> sg = new ArrayList<>();
        sg.add(4.3);
        sg.add(4.5);

        Student s1 = new Student("Anna", sg, "Информатика");
        sg.clear();
        sg.add(5.0);
        sg.add(4.8);
        sg.add(4.6);
        Student s2 = new Student("Gleb", sg, "Информатика");
        Student s3 = new Student("Dasha", sg, "Русский язык");
        sg.clear();
        sg.add(4.8);
        sg.add(4.7);
        sg.add(4.6);
        Student s4 = new Student("Olga", sg, "Информатика");
        Student s5 = new Student("Timur", sg, "Информатика");
        Student s6 = new Student("Petr", sg, "Информатика");
        Student s7 = new Student("Masha", sg, "Информатика");
        List<Student> st = new ArrayList<>();
        st.add(s1);
        st.add(s2);
        st.add(s3);
        st.add(s4);
        st.add(s5);
        st.add(s6);
        st.add(s7);
        List<Student> students2;
        students2 = Student.getAverageGradeInf(st);
        System.out.println(students2);

    }

}

