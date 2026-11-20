
class Car {

    private int carId;
    private String carName;

    public void setCarId(int id) {
        carId = id;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarName(String name) {
        carName = name;
    }

    public String getCarName() {
        return carName;
    }
}

public class Main {
    public static void main(String[] args) {

        Car c = new Car();

        c.setCarId(101);
        c.setCarName("BMW");

        System.out.println("Car ID: " + c.getCarId());
        System.out.println("Car Name: " + c.getCarName());
    }
}
