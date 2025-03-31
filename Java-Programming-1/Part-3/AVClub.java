import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String findAV;
        
        while (true){
            findAV = scanner.nextLine();
            if (findAV.equals("")){
                break;
            }
            String[] words = findAV.split(" ");

            for (String word : words){
                if (word.contains("av")){
                    System.out.println(word);
                }
            }
            
        }
        
    }
}
