import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.print("Enter the value for a : ");
        int a = scanner.nextInt();

        System.out.print("Enter the value for b : ");
        int b = scanner.nextInt();

        b=b+a;
        a=b-a;
        b=b-a;

        System.out.println("new value of a : "+a);
        System.out.println("new value of b : "+b);
    }
}
