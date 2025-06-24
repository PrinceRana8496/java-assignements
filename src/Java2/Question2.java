package Java2;
//Create a User class with fields: firstname, lastname, age, phonenumber.
// Write a program which accepts values of user fields from commandline, create object and append that to a text file.
// After every user creation the program should prompt: "Do you want to continue creating users? (Type QUIT to exit)" and keep on accepting values and writing to file unitl user quits.
import java.io.*;
import java.util.*;
class User {
    String firstname;
    String lastname;
    int age;
    String phonenumber;
    User(String firstname, String lastname, int age, String phonenumber) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.phonenumber = phonenumber;
    }
    @Override
    public String toString() {
        return firstname + " " + lastname + ", Age: " + age + ", Phone: " + phonenumber;
    }
}
public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //TRy with resources
        try (FileWriter fw = new FileWriter("users.txt", true);
             BufferedWriter bw = new BufferedWriter(fw)) {
            while (true) {
                System.out.print("Enter first name: ");
                String fname = sc.nextLine();
                System.out.print("Enter last name: ");
                String lname = sc.nextLine();
                System.out.print("Enter age: ");
                int age = Integer.parseInt(sc.nextLine());
                System.out.print("Enter phone number: ");
                String phone = sc.nextLine();
                User user = new User(fname, lname, age, phone);
                bw.write(user.toString());
                bw.newLine();
                System.out.print("Do you want to continue creating users? (Type QUIT to exit): ");
                String input = sc.nextLine();
                //If user write QUIT loop breaks
                if (input.equalsIgnoreCase("QUIT")) {
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

