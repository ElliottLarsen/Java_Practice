// Author: Elliott Larsen
// Date: 3/24/2022
// Description: This program takes a positive integer from the user and prints its factors.

import java.util.Scanner;

class Factors{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a positive integer: ");
        String input = scanner.nextLine();
        int num = Integer.parseInt(input);

        for (int i = 1; i <= num; i++){
            if(num % i == 0){
                System.out.println(i);
            } else {
                continue;
            }
        }
    }
}