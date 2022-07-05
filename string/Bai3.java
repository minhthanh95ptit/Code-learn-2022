package string;

// A palindrome is a string that reads the same left-to-right and right-to-left.

// Given the string, check if it is a palindrome.

// Example

// For inputString = "aabaa", the output should be checkPalindrome(inputString) = true;
// For inputString = "abac", the output should be checkPalindrome(inputString) = false;
// For inputString = "a", the output should be checkPalindrome(inputString) = true.

// * Notification: Must ++ point i and -- point j


public class Bai3 {
    static boolean checkPalindrome(String inputString) {
        int len = inputString.length();
        int i = 0; // pointer 1;
        int j = len - 1; // pointer 2;

        while(i < len/2) {
            if(inputString.charAt(i) != inputString.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String inputString = "abba";
        System.out.println(checkPalindrome(inputString));
    }
}
