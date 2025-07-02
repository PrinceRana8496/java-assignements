//Demonstrate the use of addFirst(), addLast, removeFirst(), removeLast, getFirst(), getLast(), reversed() in
// Set and List Sequenced collections
package BeyondJava8Features2;
import java.util.*;
public class Question6 {
    public static void main(String[] args) {
            List<String> list = new ArrayList<>(List.of("B","C","D"));
            System.out.println("Original List: " + list);
            list.addFirst("A");
            System.out.println("After addFirst: " + list);
            list.addLast("E");
            System.out.println("After addLast: " + list);
            System.out.println("getFirst: " + list.getFirst());
            System.out.println("getLast: " + list.getLast());
            list.removeFirst();
            list.removeLast();
            System.out.println("After removeFirst/removeLast: " + list);
            System.out.println("Reversed list: " + list.reversed());
            LinkedHashSet<Integer> set = new LinkedHashSet<>(Set.of(2,3,4,7,8));
            System.out.println();
            System.out.println("Original Set: " + set);
            set.addFirst(1);
            set.addLast(5);
            System.out.println("After addFirst/addLast: " + set);
            System.out.println("getFirst: " + set.getFirst());
            System.out.println("getLast: " + set.getLast());
            set.removeFirst();
            set.removeLast();
            System.out.println("After removeFirst/removeLast: " + set);
            System.out.println("Reversed set: " + set.reversed());
        }
    }
