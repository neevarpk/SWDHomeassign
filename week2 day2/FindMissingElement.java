package week2.day3.a;

import java.util.Arrays;

public class FindMissingElement {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 2, 8, 6, 7};

        Arrays.sort(arr); // Step 1: Sort the array

        for (int i = 0; i < arr.length - 1; i++) { // Step 2: Loop through the array
            if (arr[i + 1] - arr[i] > 1) { // Step 3: Check if the next element is not consecutive
                System.out.println("Missing Number: " + (arr[i] + 1)); // Step 4: Print the missing number
                break; // Break the iteration
            }
        }
    }
}

