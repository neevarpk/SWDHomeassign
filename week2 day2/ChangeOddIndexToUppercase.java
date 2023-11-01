package week2.day3.a;

public class ChangeOddIndexToUppercase {
    public static void main(String[] args) {
        String test = "changeme";
        char[] charArray = test.toCharArray(); // Step 1: Convert the string to a character array

        for (int i = charArray.length - 1; i >= 0; i--) { // Step 2: Iterate through characters from end to start
            if (i % 2 != 0) { // Step 3: Check if the index is odd
                charArray[i] = Character.toUpperCase(charArray[i]); // Step 4: Convert the character to uppercase
            }
        }

        String result = new String(charArray);
        System.out.println(result); // Step 5: Print the modified string
    }
}
