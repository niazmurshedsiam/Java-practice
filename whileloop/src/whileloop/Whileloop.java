
package whileloop;

import java.util.Scanner;


public class Whileloop {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Enter Your input = ");
        n = input.nextInt();
       int i = 0;
       while(i<n){
           System.out.println("i = "+i);
           i++;
       }
    }
    
}
