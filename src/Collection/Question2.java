package Collection;
//Given the following class Employee class{ Double Age; Double Salary; String Name}
// Design the class in such a way that the default sorting should work on firstname and lastname.
// Also, Write a program to sort Employee objects based on salary using Comparator.
import java.util.*;
class Employee implements Comparable<Employee> {
    int age;
    Double salary;
    String firstName;
    String lastName;

    public Employee(int age, Double salary, String firstName, String lastName) {
        this.age = age;
        this.salary = salary;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Default (natural) sorting: First by firstName, then by lastName
    @Override
    public int compareTo(Employee other) {
        int firstCompare = this.firstName.compareTo(other.firstName);
        if (firstCompare != 0) {
            return firstCompare;
        }
        return this.lastName.compareTo(other.lastName);
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " Age: " + age + " Salary: " + salary;
    }
}
class SalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.salary.compareTo(e2.salary);
    }
}

public class Question2 {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(23, 50000.0, "Prince", "Rana"));
        employees.add(new Employee(22, 60000.0, "Aman", "Agarwal"));
        employees.add(new Employee(23, 55000.0, "Sumit", "Shrivastava"));
        employees.add(new Employee(20, 45000.0, "Azzam", "Khan"));

        // Natural Order
        Collections.sort(employees);
        System.out.println("Sorted by name (default Comparable):");
        for (Employee e : employees) {
            System.out.println(e);
        }
        System.out.println();
        //Using Comparator
        System.out.println("Sorted by salary (Comparator):");
        Collections.sort(employees, new SalaryComparator());
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}
