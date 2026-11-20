
import java.util.Scanner;

public class SearchBooking {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] bookingIds = {301, 302, 303, 304, 305};

        System.out.print("Enter Booking ID: ");
        int id = sc.nextInt();

        int found = 0;

        for (int i = 0; i < bookingIds.length; i++) {

            if (bookingIds[i] == id) {
                System.out.println("Booking Found!");
                System.out.println("Booking ID: " + bookingIds[i]);
                found = 1;
                break;
            }
        }

        if (found == 0) {
            System.out.println("Booking Not Found!");
        }

        sc.close();
    }
}
