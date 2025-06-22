//Create a custom exception that do not have any stack trace.
public class Question9 extends Exception{
    public Question9(String message) {
        super(message);
    }
    // This makes it skip collecting where the error happened
    @Override
    public Throwable fillInStackTrace() {
        return this;
    }
    public static void main(String[] args) {
        try {
            throw new Question9("Something went wrong, but we won't show where!");
        } catch (Question9 e) {
            System.out.println("Error message: " + e.getMessage());
            System.out.println("Now printing stack trace (will be empty):");
            e.printStackTrace(); // This will only show the message
        }
    }
}
