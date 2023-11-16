public class DuplicateCount {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 2, 5, 6, 1, 7, 8, 7, 9, 10, 1};

        // Count duplicate occurrences
        for (int i = 0; i < array.length - 1; i++) {
            int count = 1;

            if (array[i] != -1) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] == array[j]) {
                        count++;
                        // Mark the duplicate element as -1 to avoid counting it again
                        array[j] = -1;
                    }
                }

                // Print the duplicate count
                if (count > 1) {
                    System.out.println(array[i] + ": " + count + " times");
                }
            }
        }
    }
}
