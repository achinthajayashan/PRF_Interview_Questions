import java.util.Arrays;
import java.util.Scanner;

public class ListHasOnlyOddNumbers {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        int count=0;

        int[] numbers= new int[10];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter the "+(i+1)+" number : ");
            numbers[i]=scanner.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]%2==1){
                count++;
            }
        }

        if (count>0){
            System.out.println("This list have odd numbers");
        }else {
            System.out.println("this list haven't odd numbers");
        }

    }
}
