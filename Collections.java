
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<>();

        cars.add("BMW");
        cars.add("Audi");
        cars.add("Benz");

        System.out.println(cars);

        cars.add("Toyota");

        System.out.println("After adding:");
        System.out.println(cars);

    }
}
