import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String original;
        
        while (true){
            original = scanner.nextLine();
            if (original.equals("")){
                break;
            }
            
            String[] lines = original.split(" ");
            for (String word : lines) {
                System.out.println(word);
            }
            
        }


    }
}
