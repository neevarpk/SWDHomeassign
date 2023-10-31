package week2.day1;

public class PalindromeChecker {
	    public static void main(String[] args) {
	        int num = 12; // Change the value of 'num' to test different numbers
	        int reversed = 0;
	        int originalNum = num;

	        while (num > 0) {
	            int digit = num % 10;
	            reversed = reversed * 10 + digit;
	            num = num / 10;
	        }

	        if (originalNum == reversed) {
	            System.out.println(originalNum + " is a palindrome");
	        } else {
	            System.out.println(originalNum + " is not a palindrome");
	        }
	    }
	}
