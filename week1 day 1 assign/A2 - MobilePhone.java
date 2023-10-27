

						// Assignment 2 - MobilePhone - Example 1

package week1.day1;

public class MobilePhone {

	
		// TODO Auto-generated method stub
		// here we are using mobile details methods 
		public void mobileDetails () {
			String mobileMake = "Mi 11x 5G";
			float mobileWeight = (float) 256.5; 	
			System.out.println("My mobile is  - " + mobileMake + " and Mobile weight is - " + mobileWeight +"g");
		}
		
		public void sendMsg () {
			boolean isFullyCharged = true;
			int mobileCost = 28000; 	
			System.out.println("is Fully charged? - " + isFullyCharged + " and Mobile price is - " + mobileCost);
		}
		public static void main(String[] args) {
			
			MobilePhone Device = new MobilePhone();
			Device.mobileDetails();
			Device.sendMsg();
			System.out.println("This is my mobile info");
			
		}
	}



Output for our reference :

My mobile is Mi 11x 5G and Mobile weight is - 256.5g
Is fully charged? - true and Mobile cost is - 28000
This is my mobile info
