package BeyondJava8Features2;
import java.util.Objects;
//Student Record Created
record Person(int id,String name,int standard){

}

public class Student {
    public static void main(String[] args) {
         Person p=new Person(1001,null,12);
        System.out.println(p.name());
    }
}
