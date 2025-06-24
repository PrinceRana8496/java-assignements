package Java2;
//Write a program to show application of Factory Design Pattern.

//Shape interface
interface Shape {
    void draw();
}
//Circle implements Shape
class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing Circle...");
    }
}
//Rectangle implements Shape
class Rectangle implements Shape {
    public void draw() {
        System.out.println("Drawing Rectangle...");
    }
}
//Factory class
class ShapeFactory {
    public Shape getShape(String type) {
        if (type == null) return null;
        if (type.equalsIgnoreCase("circle")) {
            return new Circle();
        } else if (type.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        }
        return null;
    }
}
//Factory pattern demo
public class Question4 {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        Shape shape1 = factory.getShape("circle");
        shape1.draw();
        Shape shape2 = factory.getShape("rectangle");
        shape2.draw();
    }
}
