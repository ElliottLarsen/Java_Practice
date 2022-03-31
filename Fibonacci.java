// Author: Elliott Larsen
// Date: 3/30/2022
// Description: This program calculates and returns nth Fibonacci number.  The Fibonacci number is calculated using a for loop and not recursion.

public class Fibonacci {
    
    int Fib(int a) {
        int returnVal = 1;
        if (a >= 3) {
            int first_num = 1;
            int second_num = 1;

            for (int i = 2; i < a; ++i){
                returnVal = first_num + second_num;
                first_num = second_num;
                second_num = returnVal;
            }
        }
        
        return returnVal;
    }

    public static void main(String[] args){
        
        // nth Fibonacci number.
        int nth = 10;
        Fibonacci fib = new Fibonacci();

        int result = fib.Fib(nth);
        System.out.println(result);
    }
}
