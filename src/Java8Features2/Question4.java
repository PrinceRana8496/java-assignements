//Write a program to showcase the use of optional class
package Java8Features2;
import java.util.Optional;
public class Question4{
    static String getName() {
        return Math.random()>5? "Everyone" : null;
    }
    public static void main(String[] args) {
        String name = getName();//can give null
        Optional<String> optName = Optional.ofNullable(name);
        System.out.println("Name length: " +
                optName.map(String::length).orElse(0));
        optName.ifPresent(n -> System.out.println("Hello " + n));
    }


}
