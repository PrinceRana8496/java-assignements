//Using (instance) Method reference create and apply add and subtract method and using (Static)
// Method reference create and apply multiplication method for the functional interface created
package java8features1;
@FunctionalInterface
interface ArithmeticOp {
    int operate(int a, int b);
}

class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    public int subtract(int a, int b) {
        return a - b;
    }
    // Static method
    public static int multiply(int a, int b) {
        return a * b;
    }
}

public class Question2 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        // Using instance method references
        ArithmeticOp addition = calculator::add;
        ArithmeticOp subtraction = calculator::subtract;
        // Using static method reference
        ArithmeticOp multiplication = Calculator::multiply;
        int a = 10, b = 4;
        System.out.println(a + " + " + b + " = " + addition.operate(a, b));
        System.out.println(a + " - " + b + " = " + subtraction.operate(a, b));
        System.out.println(a + " * " + b + " = " + multiplication.operate(a, b));
    }
}
