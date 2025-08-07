package Day5;
import java.util.*;
class Employee {
    String name;
    int salary;
    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
    public String toString() {
        return name + "=" + salary;
    }
}
public class SortSalary {
    public static void main(String[] args) {
        Employee[] employees = {
            new Employee("Manjeera", 65600),
            new Employee("Siri", 44300),
            new Employee("Alekhya", 54500)
        };
        Arrays.sort(employees, (e1, e2) -> Double.compare(e1.salary, e2.salary));
        for (int i = 0; i < employees.length; i++) {
            Employee emp = employees[i];
            System.out.println(emp);
        }
    }
}