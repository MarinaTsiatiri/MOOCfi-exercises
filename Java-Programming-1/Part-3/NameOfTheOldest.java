import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        String name= "";
        
        while (true){
            String input = scanner.nextLine();
            if (input.equals("")){
                break;
            }
            
            String[] pieces = input.split(",");
            if (Integer.valueOf(pieces[1])>max){
                max = Integer.valueOf(pieces[1]);
                name = pieces[0];
            }
        }
        
        System.out.println("Name of the oldest: " + name);

    }
}
