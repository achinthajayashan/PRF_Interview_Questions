public class PrintOneToHundredWithoutNumbers {
    public static void main(String[] args) {
        // Using ASCII values to represent digits
        int zero = 'A' / 'A';  // 'A' has ASCII value 65
        int one = 'B' / 'B';
        int two = one + one;
        int three = two + one;
        int four = two + two;
        int five = four + one;
        int six = three * two;
        int seven = six + one;
        int eight = four * two;
        int nine = eight + one;

        // Using loops to print numbers from 1 to 100
        for (int i = zero; i <= (nine + one) * (nine + one); i++) {
            System.out.println(i);
        }
    }
}
