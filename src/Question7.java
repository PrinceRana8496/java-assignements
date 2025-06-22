//WAP showing try, multi-catch and finally blocks.
public class Question7 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30};
        String str = "abc";
        try {
            System.out.println(numbers[5]); // Test ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array error: " + e.getMessage());
        } catch(Exception e)
        {
            System.out.println(e);
        }

        try {
            int num = Integer.parseInt(str); // Test NumberFormatException
        } catch (NumberFormatException e) {
            System.out.println("Number format error: " + e.getMessage());
        }

        try {
            int result = 10 / 0; // Test ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Math error: " + e.getMessage());
        }
        finally {
            System.out.println("This block always executes, regardless of exceptions");
        }

        System.out.println("Program continues after exception handling");
    }
}
