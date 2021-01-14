
package factorialseries;

import java.util.Scanner;


public class Factorialseries {

    
    public static void main(String[] args) {
       int n,fact=1;
       Scanner input = new Scanner(System.in);
       System.out.println("Enter your input = ");
       n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            fact=fact*i;
     
        }
        System.out.println(fact);
    }
    
}
