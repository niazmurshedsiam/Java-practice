
package pattern.pkg1;

import java.util.Scanner;


public class Pattern1 {
    public static void main(String[] args) {
        int n;
       Scanner input = new Scanner(System.in);
       System.out.println("Enter your number = ");
       n = input.nextInt();
        
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                 System.out.print(" " +col);
       
                
            }
             System.out.println();
       
            
        }
        
    }
    
}