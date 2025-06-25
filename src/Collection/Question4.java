package Collection;
//Create class Employee with attributes name,age,designation and use instances of these class as keys in a Map and their salary as value
import java.util.*;
class Employees{
    String name;
    int age;
    String designation;

    public Employees(String name, int age, String designation) {
        this.name = name;
        this.age = age;
        this.designation = designation;
    }

    // Override equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Employees)) return false;
        Employees other = (Employees) obj;
        return age == other.age &&
                Objects.equals(name, other.name) &&
                Objects.equals(designation, other.designation);
    }
    //  Override hashcode
    @Override
    public int hashCode() {
        return Objects.hash(name, age, designation);
    }
    // Overide toString
    @Override
    public String toString() {
        return name + " (" + designation + ", " + age + ")";
    }
}
public class Question4 {
    public static void main(String[] args) {
        Map<Employees, Double> employeeSalaries = new HashMap<>();
        Employees e1 = new Employees("Prince", 30, "Developer");
        Employees e2 = new Employees("Aman", 35, "Manager");
        Employees e3 = new Employees("Praful", 28, "Tester");
        employeeSalaries.put(e1, 75000.0);
        employeeSalaries.put(e2, 90000.0);
        employeeSalaries.put(e3, 60000.0);
        // Print all entries
        for (Map.Entry<Employees, Double> entry : employeeSalaries.entrySet()) {
            System.out.println(entry.getKey() + ",Salary:" + entry.getValue());
        }
    }
}

