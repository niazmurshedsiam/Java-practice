
package forloopusermandn;

import java.util.Scanner;


public class Forloopusermandn {

   
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int m,n,sum=0;
       System.out.println("Enter your input = ");
        m = input.nextInt();
      System.out.println("enter your input = ");
        n = input.nextInt();
        for (int i = m; i <= n; i++) {
            if(i%2!=0)
            {
                sum=sum+i;
                   System.out.println(i);
            }
           
            
        }
         System.out.println("odd sum is = "+sum);
    }

    
    
}
