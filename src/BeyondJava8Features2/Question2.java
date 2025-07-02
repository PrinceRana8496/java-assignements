package BeyondJava8Features2;
import java.util.Objects;
record Person1(int id,String name,int standard){

    Person1{
        Objects.requireNonNull(name,"Name is requied cannot be null");
    }
}

public class Question2 {
    public static void main(String[] args) {
        Person1 p=new Person1(1001,"Prince",12);
        System.out.println(p.name());
    }
}
