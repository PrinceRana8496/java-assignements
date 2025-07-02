package BeyondJava8Features2;
import java.util.Objects;
record Student1(int id, String name, int standard) {

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student1 student = (Student1) o;
        return id == student.id &&
                standard == student.standard &&
                name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, standard);
    }
}

public class Question3 {
    public static void main(String[] args) {
        Student1 student1 = new Student1(1, "Aman", 10);
        Student1 student2 = new Student1(1, "Aman", 10);
        Student1 student3 = new Student1(2, "Sumit", 11);

        System.out.println(student1.equals(student2));
        System.out.println(student1.equals(student3));
        System.out.println(student1.hashCode() == student2.hashCode());


    }
}