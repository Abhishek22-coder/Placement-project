
import java.util.Scanner;

public class CarRecommendation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] cars = {"Swift", "Hyundai i20", "BMW", "Audi"};
        int[] prices = {1500, 1800, 5000, 6000};

        System.out.print("Enter your daily budget: ");
        int budget = sc.nextInt();

        int found = 0;

        System.out.println("\nAvailable Cars:");

        for (int i = 0; i < cars.length; i++) {

            if (prices[i] <= budget) {
                System.out.println(cars[i] + " - Rs." + prices[i]);
                found = 1;
            }
        }

        if (found == 0) {
            System.out.println("No cars available within your budget.");
        }

        sc.close();
    }
}
