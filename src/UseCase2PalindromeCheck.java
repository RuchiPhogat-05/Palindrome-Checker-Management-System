public class UseCase2PalindromeCheck {

    public static void main(String[] args) {

        System.out.println("Program Started...");

        String text = "madam"; // Hardcoded string

        boolean isPalindrome = checkPalindrome(text);

        System.out.println("Input text: " + text);
        System.out.println("Is it a palindrome? : " + isPalindrome);

        System.out.println("Program Ended.");
    }

    public static boolean checkPalindrome(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return str.equalsIgnoreCase(reversed);
    }
}
