
abstract class Vehicle {

    abstract void display();
}

class Car extends Vehicle {

    void display() {
        System.out.println("Car ID: 101");
        System.out.println("Car Name: BMW");
        System.out.println("Rental Price: Rs.5000");
    }
}

public class Main {
    public static void main(String[] args) {

        Car c = new Car();

        c.display();
    }
}
