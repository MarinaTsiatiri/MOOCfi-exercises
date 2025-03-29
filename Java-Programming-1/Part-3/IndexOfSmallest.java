
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Integer> numbers = new ArrayList<>();
        while (true){
            int num = Integer.valueOf(scanner.nextLine());
            if (num==9999){
                break;
            }
            
            numbers.add(num);
        }
        
        int min=numbers.get(0);
        for (int i=1;i<numbers.size();i++){
            if (numbers.get(i)<min){
                min = numbers.get(i);
            } 
        } 
        
        System.out.println("Smallest number: " + min);
        
        for (int i=0;i<numbers.size();i++){
            if (numbers.get(i).equals(min)){
                System.out.println("Found at index: " + i);
            }             
        }

        
    }
}
