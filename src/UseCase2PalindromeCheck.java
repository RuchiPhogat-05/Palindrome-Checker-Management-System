public class UseCase2PalindromeCheck {

    public static void main(String[] args) {

        // Step 1: Program starts
        System.out.println("Program Started...");

        // Step 2: Hardcoded string
        String text = "madam"; // Change this to test other strings

        // Step 3: Check if palindrome
        boolean isPalindrome = checkPalindrome(text);

        // Step 4: Print result
        System.out.println("Input text: " + text);
        System.out.println("Is it a palindrome? : " + isPalindrome);

        // Step 5: Program exits
        System.out.println("Program Ended.");
    }

    // Method to check palindrome
    public static boolean checkPalindrome(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return str.equalsIgnoreCase(reversed);
    }
}
