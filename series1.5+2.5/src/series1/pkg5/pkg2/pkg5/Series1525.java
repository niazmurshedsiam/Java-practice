

package series1.pkg5.pkg2.pkg5;

import java.util.Scanner;


public class Series1525 {

   
    public static void main(String[] args) {
      double n,sum=0;
      Scanner input = new Scanner (System.in);
      System.out.println("enter your input = ");
      n = input.nextDouble();
        for (double i = 1.5; i <=n; i++) {
            sum = sum + i;
            System.out.println(i+"");
            
        }
         System.out.println("");
         System.out.println(sum);
      
    }
    
}
