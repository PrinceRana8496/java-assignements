//WAP to produce NoClassDefFoundError and ClassNotFoundException exception.
class MissingClass
{
    public MissingClass() {
        System.out.println("MissingClass constructor called");
    }
}

public class Question8 {
    public static void demonClassNotFoundException() {
        try {
            // Trying to load a non-existent class
            Class.forName("NonExistentClass");
        } catch (ClassNotFoundException e) {
            System.out.println("Caught ClassNotFoundException: " + e.getMessage());
        }
    }
    public static void demoNoClassDefFoundError() {
        try {
            // This will fail at runtime if MissingClass was available at compile time but not at runtime
            new MissingClass();
        } catch (Throwable e) {
            System.out.println("Caught NoClassDefFoundError: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
            System.out.println("=== Demonstrating ClassNotFoundException ===");
            demonClassNotFoundException();

            System.out.println("\n=== Demonstrating NoClassDefFoundError ===");
            demoNoClassDefFoundError();
    }
}
