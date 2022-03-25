// Author: Elliott Larsen
// Date: 3/24/2022
// Description: It collects integers from the user and prints the minimum and maximum of those values.

import java.util.Scanner;

class MinMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many integers would you like to enter?");
        String input = scanner.nextLine();
        int count = Integer.parseInt(input);
        int min = 0;
        int max = 0;
        System.out.println("Please enter " + input + " integers.");
        for (int i = 0; i < count; ++i){
            String num = scanner.nextLine();
            int numReal = Integer.parseInt(num);
            
            if (numReal < min){
                min = numReal;
            } 
            else if (numReal > max){
                max = numReal;
            }
        }
        System.out.println("min: " + min);
        System.out.println("max: " + max);
    }
}
