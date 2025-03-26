import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Value of the gift? ");
        double g = Double.valueOf(scan.nextLine());
        double tax = 0.0;
        
        if (g < 5000) {
            System.out.println("No tax!");
        } else if (g <= 25000) {
            tax = 100 + (g - 5000) * 0.08;
        } else if (g <= 55000) {
            tax = 1700 + (g - 25000) * 0.10;
        } else if (g <= 200000) {
            tax = 4700 + (g - 55000) * 0.12;
        } else if (g <= 1000000) {
            tax = 22100 + (g - 200000) * 0.15;
        } else {
            tax = 142100 + (g - 1000000) * 0.17;
        }

        if (g >= 5000) {
            System.out.println("Tax: " + tax);
        }
    }
}
