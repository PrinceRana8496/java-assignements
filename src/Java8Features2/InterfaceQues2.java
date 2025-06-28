//Create and access default and static method of an interface.
package Java8Features2;
interface Greeting {
    // abstract method
    void sayHello(String name);
    // default method
    default void sayDefaultHello() {
        System.out.println("Hello from default method!");
    }
    // static method
    static void sayStaticHello() {
        System.out.println("Hello from static method!");
    }
}
public class InterfaceQues2 implements Greeting {
    @Override
    public void sayHello(String name) {
        System.out.println("Hello, " + name);
    }
    public static void main(String[] args) {
        InterfaceQues2 d = new InterfaceQues2();
        //abstract method called
        d.sayHello("Prince");
        //default method called
        d.sayDefaultHello();
        // static method called
        Greeting.sayStaticHello();
    }
}
