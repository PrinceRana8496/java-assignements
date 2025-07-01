//Use iterator stream method to generate a stream
package BeyondJava8Features1;
import java.util.stream.Stream;
public class Question1 {
    public static void main(String[] args) {
        Stream.iterate(0,n->n<=10,n->n+2)
                .forEach(System.out::println);
    }
}
