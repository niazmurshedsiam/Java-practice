
package mul1to5;

import java.util.Scanner;

public class Mul1to5 {

   
    public static void main(String[] args) {
               int n,m;
       Scanner input = new Scanner(System.in);
        System.out.println("Enter your input = ");
       m = input.nextInt();
       System.out.println("Enter your input = ");
       n = input.nextInt();
        System.out.println("\n");
       
        for (int i = m; i <= n; i++) {
            
        
        for (int j = 1; j <= 10; j++) {
            System.out.println(i+" x "+j+ " = "+i*j);
        }
        
            
      System.out.println("\n");
        }
    }
    
}
