//Write the following a functional interface and implement it using lambda:
// 1. To check whether the first number is greater than second number or not, Parameter (int ,int ) Return type boolean
// 2. Increment the number by 1 and return incremented value Parameter (int) Return int
// 3. Concatination of 2 string Parameter (String , String ) Return (String)
// 4. Convert a string to uppercase and return . Parameter (String) Return (String)
package java8features1;
@FunctionalInterface
interface NumberComparator {
    boolean isFirstGreater(int a, int b);
}

@FunctionalInterface
interface NumberIncrementer {
    int increment(int num);
}

@FunctionalInterface
interface StringConcatenator {
    String concatenate(String s1, String s2);
}

@FunctionalInterface
interface StringToUpper {
    String convertToUpper(String str);
}
public class Question1 {
    public static void main(String[] args) {
        // Number comparison
        NumberComparator comparator = (a, b) -> a > b;
        System.out.println("Is 6 > 3? " + comparator.isFirstGreater(6, 3));

        //Number increment
        NumberIncrementer incrementer = num -> num + 1;
        System.out.println("Increment 5: " + incrementer.increment(5));

        //String concatenation
        StringConcatenator concatenator = (s1, s2) -> s1 + s2;
        System.out.println("Concatenate 'Prince' and 'Rana': " + concatenator.concatenate("Prince", "Rana"));

        //String to uppercase
        StringToUpper upperConverter = str -> str.toUpperCase();
        System.out.println("Uppercase of 'upper': " + upperConverter.convertToUpper("upper"));
    }
}



