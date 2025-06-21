//Write a class with FirstName, LastName & age field. Print Firstname, LastName & age using static block, static method & static variable respectively.

public class Question1 {

    // Static variables
    static String firstName = "Prince";
    static String lastName;
    static int age;

    // Static block: runs once when the class is loaded
    static {
        lastName = "Rana";
        System.out.println("First Name (from static block): " + firstName);
    }

    // Static method
    static void displayLastName() {
        System.out.println("Last Name (from static method): " + lastName);
    }

    // Main method
    public static void main(String[] args) {
        // Assign value to static variable 'age'
        age = 23;

        // Call static method
        displayLastName();

        // Print age using static variable
        System.out.println("Age (from static variable): " + age);
    }
}

