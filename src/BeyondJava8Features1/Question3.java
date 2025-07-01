//Use Of method to create List, Set and Map
package BeyondJava8Features1;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Question3 {
    public static void main(String[] args) {
        //List using .of
        List<String> immutableList = List.of("Aman", "Binod", "Sumit","Raj");
        System.out.println(immutableList);
        //Set using .of
        Set<String> immutableSet = Set.of("Apple", "Banana", "Orange");
        System.out.println(immutableSet);
        //Map using .of
        Map<String, Integer> immutableMap = Map.of("A", 1, "B", 2);
        System.out.println(immutableMap);
    }
}
