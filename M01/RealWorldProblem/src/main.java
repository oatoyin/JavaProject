// Name: Real World Problem
// Author: Toyin Awosanya
// Date: 9/20/2019
// Version: 1.0
// Purpose: Create a Proof of Concept to a portion of the features for the hospita



import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name");
        String fname = input.nextLine();// input

        System.out.println("Enter your last name");
        String lname = input.nextLine();

        System.out.println("Enter your address");
        String address = input.nextLine();

        /* Statement is user has 2nd address */
       /*  System.out.print("Enter your second address"); */
        System.out.println("Enter your city");
        String city = input.nextLine();

        System.out.println("Enter your state");
        String state = input.nextLine();

        System.out.println("Enter your zip code");
        String zip = input.nextLine();

        System.out.println("Enter the amount you owe");
        String aowed = input.nextLine();

        System.out.println("Enter the amount you paid");
        String payamt = input.nextLine();

        System.out.println("Enter the payment date");
        String paydate = input.nextLine();

        /*How much do you owe? */
        /*How much have you paid? */
        /* Display payment date */

        System.out.println("\t\t\t\t\t\tXYZ Community Hospital");
        System.out.println("===================================================================================================================");
        System.out.println("\t\tName\t\t\t\t Address\t\t\t\t\t\t\t\t\t Payment Information");
        System.out.println("Last\t\tFirst\t\t\tAddress Line 1 \t\t\tCity \t\t State \t\t Zip \t\t Amount Owed \t\t Payment amt. \t\t Payment Date");
        // add amount owed, paid, and date
        System.out.println(lname + "\t\t" + fname + "\t\t\t" + address + "\t\t\t" + city + "\t\t\t" + state + "\t\t" + zip + "\t\t $" +aowed + "\t\t\t\t" + payamt + "\t\t\t\t" + paydate);
    }
}
