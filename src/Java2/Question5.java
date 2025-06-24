package Java2;

class MySingleton {
    private static MySingleton instance = null;
    // Private constructor to prevent creating objects from outside
    private MySingleton() {
        System.out.println("Singleton object created.");
    }
    // Method to get the single instance
    public static MySingleton getInstance() {
        if (instance == null) {
            instance = new MySingleton();
        }
        return instance;
    }
    public void printMessage() {
        System.out.println("This is a method from the Singleton class.");
    }
}
public class Question5 {
    public static void main(String[] args) {
        MySingleton first = MySingleton.getInstance();
        first.printMessage();
        MySingleton second = MySingleton.getInstance();
        second.printMessage();
        // Check if both are the same object
        if (first == second) {
            System.out.println("Same object confirmed.");
        } else {
            System.out.println("Different instances found!");
        }
    }
}
