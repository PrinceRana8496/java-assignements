package Collection;
//Write Java code to define List. Insert 5 floating point numbers in List, and using an iterator, find the sum of the numbers in List.
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Question1 {
    public static void main(String[] args) {
        //created list of type float
        List<Float> list=new ArrayList<>();
        list.add(8.3f);
        list.add(7.2f);
        list.add(4.0f);
        list.add(10.5f);
        //created iterator to traverse list
        Iterator<Float> it= list.iterator();
        float sum=0;
        while(it.hasNext())
        {
            sum+= it.next();
        }
        System.out.println("Sum of all float value is:"+sum);
    }


}
