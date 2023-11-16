import java.util.Scanner;

public class WovelCheck {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.print("Enter the word : ");
        String word = scanner.next();

        checkVowels(word);


    }

    public static void checkVowels(String word){
        if (word.toLowerCase().matches(".*[aeiou].*")){
            System.out.println("vowel found");
        }else {
            System.out.println("no wovels");
        }
    }
}
