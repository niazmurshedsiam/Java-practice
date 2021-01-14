
package reverseanumber;

import java.util.Scanner;


public class Reverseanumber {

  
    public static void main(String[] args) {
              int temp,sum=0;
       Scanner input = new Scanner(System.in);
       System.out.println("Enter your input = ");
       temp = input.nextInt();
       
       while(temp!=0)
       {
           int x = temp % 10;
           sum = sum *10 +x;
           temp = temp / 10;
          
        
            
       }
        System.out.println("sum of digit = "+sum);
    }
    
}
