
public class YourFirstAccount {

    public static void main(String[] args) {
        Account newacc = new Account("name", 100.00);
        newacc.deposit(20);
        System.out.println(newacc);
    }
}
