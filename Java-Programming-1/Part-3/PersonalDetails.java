import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";
        String compare = "";
        int count = 0;
        int sum = 0;
        
        while (true){
            String input = scanner.nextLine();
            if (input.equals("")){
                break;
            }
            
            String[] pieces = input.split(",");
            compare = pieces[0];
            
            if (compare.length()>name.length()){
                name = compare;
            }
        
            count++;
            sum += Integer.valueOf(pieces[1]);
        }
        
        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years: " + (double) sum/count);
    }
}
