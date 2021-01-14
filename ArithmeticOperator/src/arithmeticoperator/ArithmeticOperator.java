
package arithmeticoperator;

import java.util.Scanner;


public class ArithmeticOperator {

    
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in); 
      int a,b,result;
     System.out.println("Enter your input = ");
     a = input.nextInt();
     System.out.println("Enter your input = ");
     b = input.nextInt();
     result = a+b;
     System.out.println("Addition is  = "+result);
     result = a-b;
     System.out.println("Subtrtiction is = "+result);
     result = a*b;
     System.out.println("Multiple is = "+result);
     result = a/b;
     System.out.println("Divion is = "+result);
     result = a%b;
     System.out.println("Reminder is = "+result);
    }
    
}
