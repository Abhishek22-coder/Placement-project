
class Vehicle {

    void display() {
        System.out.println("Vehicle rental details");
    }
}

class Car extends Vehicle {

    @Override
    void display() {
        System.out.println("Car rental details");
    }
}

public class Main {
    public static void main(String[] args) {

        Vehicle v = new Vehicle();
        Car c = new Car();

        v.display();
        c.display();
    }
}
