// Author: Elliott Larsen
// Date: 3/21/2022
// Description: This program asks the user to enter their favorite animal and shows the result back to the user.

import java.util.Scanner;

class Animal{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your favorite animal: ");
        String animal = scanner.nextLine();

        System.out.println("Your favorite animal is: " + animal);
    }
}
