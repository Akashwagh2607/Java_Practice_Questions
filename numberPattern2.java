public class SequentialNumberPattern {
    public static void main(String[] args) {
        int rows = 4; // Number of rows in the pattern
        int num = 1;  // Starting number

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num); // Print the current number
                num++;                 // Increment the number
            }
            System.out.println(); // Move to the next line
        }
    }
}
