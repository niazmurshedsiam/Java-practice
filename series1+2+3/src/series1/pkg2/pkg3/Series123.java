
package series1.pkg2.pkg3;

import java.util.Scanner;


public class Series123 {

    public static void main(String[] args) {
       int n,sum=0;
       Scanner input = new Scanner (System.in);
       System.out.println("enter your input = ");
       n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            
            System.out.print(i+" ");
            sum = sum + i;
        }
       System.out.println();
          System.out.println(sum);
        
    }
    
}
