
import java.util.Scanner;

public class LoyaltyPoints {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int amount, points;

        System.out.print("Enter customer name: ");
        String name = sc.nextLine();

        System.out.print("Enter rental amount: ");
        amount = sc.nextInt();

        points = amount / 100;

        System.out.println("\n===== LOYALTY REWARDS =====");
        System.out.println("Customer Name: " + name);
        System.out.println("Rental Amount: Rs." + amount);
        System.out.println("Points Earned: " + points);

        System.out.println("Congratulations! You earned " + points + " points.");

        sc.close();
    }
}
