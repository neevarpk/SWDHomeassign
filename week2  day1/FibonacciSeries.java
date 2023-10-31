package week2.day1;

public class FibonacciSeries {

	
	    public static void main(String[] args) {
	        int n = 10; // Change n to the desired number of terms

	        int n1 = 0, n2 = 1;
	        System.out.println("Fibonacci series:");

	        for (int i = 1; i <= n; i++) {
	            System.out.print(n1 + " ");
	            int sum = n1 + n2;
	            n1 = n2;
	            n2 = sum;
	        }
	    }
	}
