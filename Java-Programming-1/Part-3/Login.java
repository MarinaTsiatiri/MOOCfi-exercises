import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String user1 = "alex";
        String user2 = "emma";
        String pass1 = "sunshine";
        String pass2 = "haskell";
        
        System.out.print("Enter username:");
        String userInput = scanner.nextLine();
        System.out.println("");
        System.out.print("Enter password:");
        String passInput = scanner.nextLine();
        
        if (userInput.equals(user1) && passInput.equals(pass1) || userInput.equals(user2) && passInput.equals(pass2)){
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }

    }
}
