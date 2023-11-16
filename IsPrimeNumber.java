import java.util.Scanner;

public class IsPrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Number : ");
        int number = scanner.nextInt();

        int count = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        if (count == 2) {
            System.out.println("it is a primary number");
        } else {
            System.out.println("not a primary number");
        }


    }
}
