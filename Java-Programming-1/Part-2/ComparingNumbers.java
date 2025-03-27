import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int f = Integer.valueOf(scan.nextLine());
        int s = Integer.valueOf(scan.nextLine());
        
        if (f>s) {
            System.out.println(f + " is greater than " + s + ".");
        } else if (f<s) {
            System.out.println(f + " is smaller than " + s + ".");                   
        } else {
            System.out.println(f + " is equal to " + s + ".");
        }
    }
}
