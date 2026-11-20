
class Vehicle {

    String brand = "BMW";
    int price = 5000;

    void display() {
        System.out.println("Vehicle Brand: " + brand);
        System.out.println("Rental Price: Rs." + price);
    }
}

class Car extends Vehicle {

    int carId = 101;

    void show() {
        System.out.println("Car ID: " + carId);
    }
}

public class Main {
    public static void main(String[] args) {

        Car c = new Car();

        System.out.println("===== CAR RENTAL DETAILS =====");

        c.show();
        c.display();
    }
}
