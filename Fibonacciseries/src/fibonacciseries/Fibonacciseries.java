
package fibonacciseries;

import java.util.Scanner;


public class Fibonacciseries {

   
    public static void main(String[] args) {
      int n, first=0,second=1;
      Scanner input = new Scanner (System.in);
      System.out.println("Enter your input = ");
n = input.nextInt();
System.out.println(first+" "+second);
        for (int i = 3; i <=n; i++) {
            int fibo = first + second;
            System.out.println(" "+fibo);
            first = second;
            second = fibo;
            
            
            
            
        }
        System.out.println();
    }
    
}
