
import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double amount, discount, finalAmount;

        System.out.print("Enter rental amount: ");
        amount = sc.nextDouble();

        if (amount >= 10000) {
            discount = amount * 0.20;
        }
        else if (amount >= 5000) {
            discount = amount * 0.10;
        }
        else {
            discount = 0;
        }

        finalAmount = amount - discount;

        System.out.println("Original Amount: Rs." + amount);
        System.out.println("Discount: Rs." + discount);
        System.out.println("Final Amount: Rs." + finalAmount);

        sc.close();
    }
}
