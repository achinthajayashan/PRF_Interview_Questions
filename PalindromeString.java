import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.print("Enter the word : ");
        String word = scanner.next();

        int length = word.length();

        for (int i = 0; i < length/2; i++) {
            if (word.charAt(i) != word.charAt(length - i - 1)) {
                System.out.println("Not palindrome");;
                break;
            }else {
                System.out.println("Palindrome");
                break;
            }
        }



    }
}
