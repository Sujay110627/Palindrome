import java.util.Scanner;

public class UseCase13PalindromeCheckerApp {

    // Method 1: Reverse String Method
    public static boolean reverseMethod(String str) {
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
        }

        return str.equals(reversed);
    }

    // Method 2: Two Pointer Method
    public static boolean twoPointerMethod(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Measure Reverse Method Time
        long startTime1 = System.nanoTime();
        boolean result1 = reverseMethod(input);
        long endTime1 = System.nanoTime();
        long reverseTime = endTime1 - startTime1;

        // Measure Two Pointer Method Time
        long startTime2 = System.nanoTime();
        boolean result2 = twoPointerMethod(input);
        long endTime2 = System.nanoTime();
        long twoPointerTime = endTime2 - startTime2;

        // Display results
        System.out.println("\nReverse Method Result: " + result1);
        System.out.println("Reverse Method Time: " + reverseTime + " ns");

        System.out.println("\nTwo Pointer Method Result: " + result2);
        System.out.println("Two Pointer Method Time: " + twoPointerTime + " ns");

        sc.close();
    }
}
