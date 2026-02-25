package Palindrome;

public class PalindromeCheckerApp {
    public static void main(String[] args) {

package Palindrome;


        public class UseCase2PalindromeCheckerApp {

            public static void main(String[] args) {

                // Hardcoded string
                String word = "madam";

                System.out.println("====================================");
                System.out.println(" Palindrome Checker App - UC2 ");
                System.out.println("====================================");

                System.out.println("Word to check: " + word);

                // Reverse the string
                String reversed = "";
                for (int i = word.length() - 1; i >= 0; i--) {
                    reversed += word.charAt(i);
                }

                // Check palindrome condition
                if (word.equals(reversed)) {
                    System.out.println("Result: The given word is a Palindrome.");
                } else {
                    System.out.println("Result: The given word is NOT a Palindrome.");
                }

                System.out.println("Program Ended.");
            }
        }
        git add .
    }
}
