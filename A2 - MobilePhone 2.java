

						// Assignment 2 - MobilePhone - Example 2 using Private

package week1.day1;

public class MobilePhone2 {

    private String mobileModel = "Mi 11x 5G";
    private float mobileWeight = 256.5f;
    private boolean isFullyCharged = true;
    private int mobileCost = 28000;

    public void mobileDetails() {
        System.out.println("My mobile is " + mobileModel + " and Mobile weight is - " + mobileWeight + "g");
    }

    public void sendMsg() {
        System.out.println("Is fully charged? - " + isFullyCharged + " and Mobile cost is - " + mobileCost);
    }

    public static void main(String[] args) {
        MobilePhone2 device = new MobilePhone2();
        device.mobileDetails();
        device.sendMsg();
        System.out.println("This is my mobile info");
    }
}


Output for our reference :

My mobile is Mi 11x 5G and Mobile weight is - 256.5g
Is fully charged? - true and Mobile cost is - 28000
This is my mobile info
