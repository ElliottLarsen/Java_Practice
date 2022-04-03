// Author: Elliott Larsen
// Date: 4/2/2022
// Description: This program performs multiplication recursively.

public class Multiply {
    
    // Recursive method.
    int multiply_rec(int a, int b){
        int return_val;
        
        // Base case.
        if (b == 1) {
            return_val = a;
            return return_val;
        }

        else {
            // Add a to itself b times using recursion.
            return a + multiply_rec(a, b - 1);
        }

    }

    public static void main(String[] args){
        
        // num1 * num2.
        int num1 = 9;
        int num2 = 4;

        Multiply mult = new Multiply();

        int result = mult.multiply_rec(num1, num2);

        System.out.println(result);

    }
}
