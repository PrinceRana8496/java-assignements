//Implement following functional interfaces from java.util.function using lambdas: 1. Consumer 2. Supplier 3. Predicate 4. Function
package Java8Features2;
import java.util.function.*;

public class FunctionalInterfacesQues1 {
    public static void main(String[] args) {
        // 1. Consumer
        Consumer<String> printUpperCase = str -> System.out.println(str.toUpperCase());
        printUpperCase.accept("prince rana");

        // 2. Supplier
        Supplier<Integer> randomSupplier = () ->  1;
        System.out.println("Return 1: " + randomSupplier.get());

        // 3. Predicate
        Predicate<Integer> isEven = num -> num % 2 == 0;
        System.out.println("Is 10 even " + isEven.test(10));

        // 4. Function
        Function<String, Integer> stringLength = s -> s.length();
        System.out.println("Length of 'BurjKhalifa': " + stringLength.apply("BurjKhalifa"));
    }
}
