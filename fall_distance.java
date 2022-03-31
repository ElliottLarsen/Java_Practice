// Author: Elliott Larsen
// Date: 3/30/2022
// Description: This program calculates the distance an object falls due to gravity in a specific time period.

public class fall_distance {
    double fallDistance(double a) {
        return 0.5 * 9.8 * (a * a);
    }    

    public static void main(String[] args){
        
        // Time in seconds.
        double x = 3.2;

        fall_distance fall_distance = new fall_distance();

        double result = fall_distance.fallDistance(x);

        System.out.println(result);   

    }
}
