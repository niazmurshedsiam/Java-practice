
package series1.pkg3.pkg5;

import java.util.Scanner;





public class Series135 {

  
    public static void main(String[] args) {
        int n,sum=0;
      Scanner input = new Scanner (System.in);
      System.out.println("enter your input = ");
      n = input.nextInt();
        for (int i = 1; i <= n; i=i+2) {
            
            sum=sum+i;
            System.out.println(i+" ");
        }
        System.out.println(sum);
       
    }
    
}
