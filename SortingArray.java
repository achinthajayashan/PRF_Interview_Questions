import java.util.Arrays;
import java.util.Scanner;

public class SortingArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbers[]= new int[5];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("enter number : ");
            numbers[i] = scanner.nextInt();
        }

        int n = numbers.length;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n-i; j++) {
                if (numbers[j-1]>numbers[j]){
                    int temp = numbers[j-1];
                    numbers[j-1]=numbers[j];
                    numbers[j]=temp;
                }
            }
            
        }

        System.out.println(Arrays.toString(numbers));


    }
}
