package Java2;
//Write a program to display values of enums using a constructor & getPrice() method (Example display house & their prices)

enum House {
    VILLA(7500000),
    APARTMENT(4000000),
    BUNGALOW(12000000),
    STUDIO(2500000);

    private final int price;

    House(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}

public class Question1 {
    public static void main(String[] args) {
        for (House h : House.values()) {
            System.out.println(h + " costs ₹" + h.getPrice());
        }
    }
}

