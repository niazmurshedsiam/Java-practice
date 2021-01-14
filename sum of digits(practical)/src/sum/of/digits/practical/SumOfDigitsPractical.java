
package sum.of.digits.practical;

import java.util.Scanner;


public class SumOfDigitsPractical {

   
    public static void main(String[] args) {
       int temp,sum=0;
       Scanner input = new Scanner(System.in);
       System.out.println("Enter your input = ");
       temp = input.nextInt();
       
       while(temp!=0)
       {
           int x = temp % 10;
           sum = sum +x;
           temp = temp / 10;
          
        
            
       }
        System.out.println("sum of digit = "+sum);
    }
    
}
