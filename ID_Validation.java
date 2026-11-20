
import java.util.Scanner;

public class Duplicate {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int carId[] = {101, 102, 103};

        System.out.print("Enter Car ID: ");
        int id = sc.nextInt();

        if (id == 101 || id == 102 || id == 103) {
            System.out.println("Duplicate Car ID!");
        } 
        else {
            System.out.println("Car ID is unique!");
        }

        sc.close();
    }
}
