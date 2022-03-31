// Author: Elliott Larsen
// Date: 3/30/2022
// Description: This program runs a hailstone sequence from the given integer and returns the number of steps it took to get to 1.

public class Hailstone {
    int HStone(int a){
        if (a <= 0){
            System.out.print("The number must be a positive integer.");
            return -1;
        } else{
            int counter = 0;
            while (a != 1){
                if (a % 2 == 0){
                    a /= 2;
                    counter++;
                } else{
                    a = a * 3 + 1;
                    counter++;
                }
            }
            return counter;
        }
    }

    public static void main(String[] args){
        
        // User input.
        int input = 3;
        Hailstone HStone = new Hailstone();

        int result = HStone.HStone(input);
        System.out.println(result);
    }
}
