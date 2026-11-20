
import java.util.Scanner;

public class RentalCost {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int days;
        double rentPerDay, totalAmount;

        System.out.print("Enter car rental price per day: ");
        rentPerDay = sc.nextDouble();

        System.out.print("Enter number of rental days: ");
        days = sc.nextInt();

        totalAmount = rentPerDay * days;

        System.out.println("\n===== RENTAL BILL =====");
        System.out.println("Price per day: Rs." + rentPerDay);
        System.out.println("Rental days: " + days);
        System.out.println("Total Amount: Rs." + totalAmount);

        sc.close();
    }
}
