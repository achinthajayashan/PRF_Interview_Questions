import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter the word ");
        String word = scanner.next();

        char[] wordArray = word.toCharArray();

        for (int i = wordArray.length-1; i >= 0; i--) {
            System.out.print(wordArray[i]);
        }
    }
}
