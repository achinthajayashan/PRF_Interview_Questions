import java.util.Scanner;

public class RemoveSpaces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter words :");
        String words = scanner.nextLine();

        String wordNew = words.replace(" ","");

        System.out.println(wordNew);
    }
}
