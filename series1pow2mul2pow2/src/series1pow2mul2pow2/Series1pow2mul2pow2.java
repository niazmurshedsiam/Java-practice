
package series1pow2mul2pow2;

import java.util.Scanner;


public class Series1pow2mul2pow2 {

   
    public static void main(String[] args) {
       int n,sum=1;
       Scanner input = new Scanner(System.in);
       System.out.println("Enter your input = ");
       n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            sum=sum*i*i;
            System.out.println(i+"x"+i+"");
        }
        System.out.println(sum);
    }
    
}
