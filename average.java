// Author: Elliott Larsen
// Date: 3/22/2022
// Description: This program asks the user to enter five numbers and shows the average of those numbers.

import java.util.Scanner;

class Average {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter five numbers:");
        String input1 = scanner.nextLine(); 
        String input2 = scanner.nextLine();
        String input3 = scanner.nextLine();
        String input4 = scanner.nextLine();
        String input5 = scanner.nextLine();

        // Converting strings to floats
        float num1 = Float.parseFloat(input1);
        float num2 = Float.parseFloat(input2);
        float num3 = Float.parseFloat(input3);
        float num4 = Float.parseFloat(input4);
        float num5 = Float.parseFloat(input5);
        
        float result = (num1 + num2 + num3 + num4 + num5) / 5;
        System.out.print("Option 1: The average of those numbers is:");
        System.out.println(result);
        
        // result is converted to a string.
        System.out.println("Option 2: The average of those numbers is: " + result);

    }
}
