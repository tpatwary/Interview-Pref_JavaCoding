package DailyCodingPractice;

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        String inputString = "level";
        boolean result = isPalindrome(inputString);
        System.out.println("Is " + inputString + " a palindrome? " + result);
    }

    public static boolean isPalindrome(String input) {
        int length = input.length();
        for (int i = 0; i < length / 2; i++) {
            if (input.charAt(i) != input.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
