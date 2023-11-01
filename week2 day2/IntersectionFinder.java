package week2.day3.a;

public class IntersectionFinder {
    public static void main(String[] args) {
        int a[] = {3, 2, 11, 4, 6, 7};
        int b[] = {1, 2, 8, 4, 9, 7};
        
        // Iterate over the elements of array 'a'
        for (int i = 0; i < a.length; i++) {
            // Iterate over the elements of array 'b'
            for (int j = 0; j < b.length; j++) {
                // Compare the elements of both arrays
                if (a[i] == b[j]) {
                    // If a match is found, print the matching element
                    System.out.println("Match: " + a[i]);
                }
            }
        }
    }
}
