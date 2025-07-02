package BeyondJava8Features2;
abstract sealed class Animal permits Dog, Cat, Bird {
    abstract void makeSound();
}
final class Dog extends Animal {
    @Override void makeSound() { System.out.println("Woof"); }
}
sealed class Cat extends Animal permits DomesticCat, WildCat {
    @Override void makeSound() { System.out.println("Meow"); }
}
final class DomesticCat extends Cat {}
final class WildCat extends Cat {}

non-sealed class Bird extends Animal {
    @Override void makeSound() { System.out.println("Chirp"); }
}
class Parrot extends Bird {
    @Override void makeSound() { System.out.println("Squawk"); }
}
public class Question5 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();
        Cat cat = new Cat();
        cat.makeSound();
        DomesticCat domesticCat = new DomesticCat();
        domesticCat.makeSound();
        WildCat wildCat = new WildCat();
        wildCat.makeSound();
        Bird bird = new Bird();
        bird.makeSound();
        Parrot parrot = new Parrot();
        parrot.makeSound();
    }
}
