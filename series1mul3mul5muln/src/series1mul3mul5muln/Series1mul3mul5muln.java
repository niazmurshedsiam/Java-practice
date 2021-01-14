
package series1mul3mul5muln;

import java.util.Scanner;


public class Series1mul3mul5muln {

   
    public static void main(String[] args) {
  double n,sum=1;
       Scanner input = new Scanner(System.in);
       System.out.println("Enter your input = ");
       n = input.nextDouble();
        for (double i = 1.5; i <= n; i++) {
            sum=sum*i;
            System.out.println(i+"");
        }
          System.out.println();
        System.out.println(sum);
    }
    
}
