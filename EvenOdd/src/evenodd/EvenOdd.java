
package evenodd;

import java.util.Scanner;



public class EvenOdd {

   
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int num;
      System.out.println("Enter Your Input = ");
      num = input.nextInt();
      if(num%2==0)
         System.out.println("Even num is "+num);
      else
          System.out.println("Odd num is "+num);
          
    }
    
}
