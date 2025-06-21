//Write a java program to show following menu to the user:
// *******Menu*******
// 1. Calculate Area of Circle
// 2. Calculate Circumference of a Circle
// 3. Exit. Choose an option (1-3): Take radius as user input.
// Hint: Use Switch statement to act on the menu. Also area and circumference methods should be static
import java.util.*;
public class Question3 {
    static double Areaofcircle(double r)
    {
        return 3.14*r*r;
    }
    static double Circumferenceofcircle(double r)
    {
        return 2*3.14*r;
    }
    public static void main(String[] args) {
        double radius;
        Scanner sc=new Scanner(System.in);
        System.out.println("*******Menu*******");
        System.out.println("Enter 1 to Calculate Area of Circle");
        System.out.println("Enter 2 to Calculate Circumference of Circle");
        System.out.println("Enter 3 to Exit");
        int choice=sc.nextInt();
        switch(choice)
        {
            case 1:
                System.out.print("Enter radius of Circle:");
                radius=sc.nextDouble();
                System.out.println("Area of Circle is:"+Areaofcircle(radius));
                break;
            case 2:
                System.out.print("Enter radius of Circle:");
                radius=sc.nextDouble();
                System.out.println("Circumference of Circle is:"+Circumferenceofcircle(radius));
                break;
            case 3:
                System.out.print("Exited successfully");
                break;
            default:
                break;
        }
    }
}
