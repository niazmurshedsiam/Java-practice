
package pattern.pkg2;

import java.util.Scanner;


public class Pattern2 {


    public static void main(String[] args) {
          int n;
       Scanner input = new Scanner(System.in);
       System.out.println("Enter your number = ");
       n = input.nextInt();
        
        for (int row = n; row >= 1; row--) {
            for (int col = 1; col <= row; col++) {
                 System.out.print(" " +col);
       
                
            }
             System.out.println();
       
            
        }
    }
    
}
