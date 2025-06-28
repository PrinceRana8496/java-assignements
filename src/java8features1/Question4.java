//Write a program to implement constructor reference
package java8features1;
//FI for no-arg constructor
interface PersonCreator {
    Person create();
}

//FI for parameter constructor
interface PersonFactory {
    Person create(String name);
}

class Person {
    private String name;
    public Person() {
        this.name = "Ranadom";
        System.out.println("Created Person with no name");
    }

    // Parameter constructor
    public Person(String name) {
        this.name = name;
        System.out.println("Created Person: " + name);
    }

}

public class Question4 {
    public static void main(String[] args) {
        // no-arg constructor reference
        PersonCreator anonymousCreator = Person::new;
        Person anonymous = anonymousCreator.create();

        // parameter constructor reference
        PersonFactory namedCreator = Person::new;
        Person Aman = namedCreator.create("Aman");
        Person Sumit = namedCreator.create("Sumit");


    }
}
