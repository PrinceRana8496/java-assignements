package BeyondJava8Features2;
sealed class Vehicle permits Car, Truck, Motorcycle {
}

final class Car extends Vehicle {
}

non-sealed class Truck extends Vehicle {
}

sealed class Motorcycle extends Vehicle permits SportsBike, Cruiser {
}

final class SportsBike extends Motorcycle {
}

final class Cruiser extends Motorcycle {
}
public class Question4 {
    public static void main(String[] args) {

    }
}
