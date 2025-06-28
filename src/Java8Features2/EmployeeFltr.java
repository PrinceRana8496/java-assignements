//Given a list of objects of following class: class Employee{ String fullName; Long salary; String city; }
// Get list of all unique firstNames of employees where their salary is less than 5000 and who live in delhi.
// Note: Full name is concatenation of first name, middle name and last name with single space in between.
package Java8Features2;
import java.util.*;
class Employee {
    String fullName;
    Long salary;
    String city;

    Employee(String fullName, Long salary, String city) {
        this.fullName = fullName;
        this.salary = salary;
        this.city = city;
    }

    String getFirstName() {
        return fullName.split(" ")[0];
    }
}

public class EmployeeFltr {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Aarav Kumar Patel", 4200L, "Delhi"),
                new Employee("Priya Anika Sharma", 3800L, "Delhi"),
                new Employee("Rahul Singh", 5800L, "Delhi"),
                new Employee("Neha Gupta", 5200L, "Mumbai"),
                new Employee("Vihaan Reddy", 4500L, "Dehradun"),
                new Employee("Ananya Iyer", 5500L, "Bangalore"),
                new Employee("Arjun Malhotra", 3900L, "Delhi"),
                new Employee("Ishaan Joshi", 4700L, "Delhi"),
                new Employee("Diya Chatterjee", 5100L, "Kolkata"),
                new Employee("Kabir Khan", 4300L, "Delhi")
        );

        List<String> firstNames = employees.stream()
                .filter(e -> e.salary < 5000 && e.city.equalsIgnoreCase("Delhi"))
                .map(Employee::getFirstName)
                .distinct()
                .toList();
        System.out.println("unique firstNames of employees where their salary is less than 5000 and who live in Delhi are: " + firstNames);
    }
}

