
							// Assignment 3 - Chrome Browser

package week1.day1;

public class Chrome {

	public void getName() {
		// TODO Auto-generated method stub
System.out.println("This is Chrome Browser");
	}
	public void printName() {
		System.out.println("This is Chrome Browser");
	}
   //e) Create one more class Name Browser
	//f) Call the method getName(),PrintName() from class: Browser using object reference
//	g) Run Browser class and Confirm the printed in console
	public static class browser {
		public static void main (String[] args) {
			
		Chrome Cbrowser = new Chrome();
		Cbrowser.getName();
		Cbrowser.printName();
		
	}
}}


Output: 

This is Chrome Browser
This is Chrome Browser