//Create Unmodifiable List from a Steam
package BeyondJava8Features1;
import java.util.List;
import java.util.stream.Stream;
public class Question4 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("Ronaldo","Messi","Neymar","Roony","Inista");

        // unmodifiable list created
        List<String> players = stream.toList();

        System.out.println(players);
        //players.add("Mbappe");
    }
}
