//Convert an Optional type into Stream
package BeyondJava8Features1;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
public class Question2 {
    public static void main(String[] args) {
        //find first will give optional object and .stream() convert it into stream object
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8);
        Stream<Integer> s=list.stream().findFirst().stream();
        s.forEach(System.out::println);
    }
}
