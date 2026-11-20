
import java.util.Scanner;

public class LateFee {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int dueDate, returnDate, lateDays, fine;

        System.out.print("Enter due date (day): ");
        dueDate = sc.nextInt();

        System.out.print("Enter return date (day): ");
        returnDate = sc.nextInt();

        if (returnDate > dueDate) {
            lateDays = returnDate - dueDate;
            fine = lateDays * 5;

            System.out.println("Late days: " + lateDays);
            System.out.println("Total fine: Rs." + fine);
        } 
        else {
            System.out.println("No late fee!");
        }

        sc.close();
    }
}
