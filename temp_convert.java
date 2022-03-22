// Author: Elliott Larsen
// Date: 3/21/2022
// Description: This program converts Celsius temperatures to Fahrenheit temperatures.  The formula used in this program is: F = (9/5)C + 32.

import java.util.Scanner;

class TempConvert {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a Celsius temperature.");
        String input = scanner.nextLine();
        float celTemp = Float.parseFloat(input);

        double result = (9.0/5.0) * celTemp + 32;

        System.out.print("The equivalent Fahrenheit temperature is: " + result);


    }
}
