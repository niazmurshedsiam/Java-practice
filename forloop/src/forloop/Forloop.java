
package forloop;

import java.util.Scanner;

public class Forloop {

   
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int n;
        System.out.println("Enter Your input = ");
        n = input.nextInt();
        /*for (int i = 0; i < n; i++) {
            System.out.println("i = "+i);
        }*/
        for (int i = 10; i >= n; i--) {
            System.out.println("i = "+i);
            
        }
      
    }
    
}
