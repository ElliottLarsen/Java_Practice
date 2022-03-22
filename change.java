// Author: Elliott Larsen
// Date: 3/21/2022
// Description: This program asks the user for a number of cents (up to 99 cents) and shows how many of each type of coin make up that amount.

import java.util.Scanner;

class change {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter an amount in cents (up to 99 cents)");
        String input = scanner.nextLine();
        int amount = Integer.parseInt(input);

        int quarter, dime, nickel, penny, quarterRemainder, dimeRemainder;

        quarter = amount / 25;
        quarterRemainder = amount % 25;

        dime = quarterRemainder / 10;
        dimeRemainder = quarterRemainder % 10;

        nickel = dimeRemainder / 5;
        penny = dimeRemainder % 5;


        System.out.println("Your change will be: ");
        System.out.println("Q: " + quarter);
        System.out.println("D: " + dime);
        System.out.println("N: " + nickel);
        System.out.println("P: " + penny);

    }
    
}
