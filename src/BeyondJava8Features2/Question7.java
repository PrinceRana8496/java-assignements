//Demonstrate the use of firstEntry(), lastEntry(), pollFirstEntry(), pollLastEntry(), putFirst(),
// putLast(), reversed() with SequencedMap.
package BeyondJava8Features2;
import java.util.LinkedHashMap;
public class Question7 {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        map.put("Dog",2);
        map.put("Cat",3);
        map.put("Lion",4);
        System.out.println("Original Map: "+ map);
        map.putFirst("Monkey", 1);
        map.putLast("Horse", 5);
        System.out.println("After putFirst/putLast: " + map);
        System.out.println("firstEntry: " + map.firstEntry());
        System.out.println("lastEntry: " + map.lastEntry());
        System.out.println("pollFirstEntry: " + map.pollFirstEntry());
        System.out.println("pollLastEntry: " + map.pollLastEntry());
        System.out.println("After polling: " + map);
        System.out.println("Reversed map: " + map.reversed());
    }
}
