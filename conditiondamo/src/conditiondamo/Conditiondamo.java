
package conditiondamo;

import java.util.Scanner;


public class Conditiondamo {

   
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
        int a,b,result;
        System.out.println("Enter two input =");
        a = input.nextInt();
        b = input.nextInt();
        result = (a>b) ? a:b ;
        System.out.println("Large number is "+result);
    }
    
}
