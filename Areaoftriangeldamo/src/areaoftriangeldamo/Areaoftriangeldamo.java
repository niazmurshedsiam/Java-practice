
package areaoftriangeldamo;

import java.util.Scanner;


public class Areaoftriangeldamo {

    
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       float b,h,result;
       System.out.println("Enter Your input = ");
        b = input.nextFloat();
        System.out.println("Enter Your input = ");
        h = input.nextFloat();
        result = (float) (0.5*b*h);
        System.out.println("Result is"+result);
    }
    
}
