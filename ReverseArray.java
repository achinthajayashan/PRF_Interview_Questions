import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbers[]=new int[5];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter the Number");
            numbers[i] = scanner.nextInt();
        }

        int startIndex=0;
        int endIndex =numbers.length-1;

        while (startIndex<endIndex){
            int temp = numbers[startIndex];
            numbers[startIndex]=numbers[endIndex];
            numbers[endIndex]=temp;

            startIndex++;
            endIndex--;
        }

        System.out.println(Arrays.toString(numbers));
        
    }
}
