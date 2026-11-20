
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] carIds = {101, 102, 103, 104, 105};

        System.out.print("Enter Car ID to search: ");
        int id = sc.nextInt();

        int found = 0;

        for (int i = 0; i < carIds.length; i++) {

            if (carIds[i] == id) {
                System.out.println("Car found!");
                System.out.println("Car ID: " + carIds[i]);
                found = 1;
                break;
            }
        }

        if (found == 0) {
            System.out.println("Car not found!");
        }

        sc.close();
    }
}
