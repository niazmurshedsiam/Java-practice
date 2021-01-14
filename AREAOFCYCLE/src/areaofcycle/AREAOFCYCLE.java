
package areaofcycle;

import java.util.Scanner;


public class AREAOFCYCLE {

    
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       float r,A;
       System.out.println("Enter your input = ");
       r = input.nextFloat();
       A = (float) (3.1416*r*r);
       System.out.println("Area is"+A);
    }
    
}
