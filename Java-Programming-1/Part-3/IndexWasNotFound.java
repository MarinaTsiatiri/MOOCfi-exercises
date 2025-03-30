import java.util.Scanner;

public class IndexWasNotFound {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        array[0] = 6;
        array[1] = 2;
        array[2] = 8;
        array[3] = 1;
        array[4] = 3;
        array[5] = 0;
        array[6] = 9;
        array[7] = 7;

        System.out.print("Search for? ");
        int key = Integer.valueOf(scanner.nextLine());

        int index = 0;
        boolean found = false;
        int where = 0;
        while (index<array.length){
            if (array[index]==key){
                found = true;
                where = index;
                break;
            }
            index++;
        }
        
        if (found){
            System.out.println(key + " is at index " + where  + ".");
        } else {
            System.out.println(key + " was not found.");
        }
    }

}
