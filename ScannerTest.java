import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Your Name");
        String name= input.next();

        System.out.println("Your Name Is "+ name);
    }
}
