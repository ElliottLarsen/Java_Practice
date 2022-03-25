// Author: Elliott Larsen
// Date: 3/24/2022
// Description: This is a number guessing program.

import java.util.Scanner;

class num_guess {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the integer for the player to guess.");
        String num = scanner.nextLine();
        int guessNum = Integer.parseInt(num);
        int count = 1;

        boolean condition = true;

        System.out.println("Enter your guess.");
        while (condition){
            String number = scanner.nextLine();
            int guess = Integer.parseInt(number);
            if (guess < guessNum){
                System.out.println("Too low - try again.");
                count += 1;
                continue;
            } else if (guess > guessNum){
                System.out.println("Too high - try again.");
                count += 1;
                continue;
            } else if (guess == guessNum && count == 1) {
                System.out.println("You guess it in " + count + " try.");
                condition = false;
            } 
            else {
                System.out.println("You guess it in " + count + " tries.");
                condition = false;
            }
        }
    }
}
