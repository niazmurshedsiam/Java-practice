
package primenumber;

import java.util.Scanner;


public class Primenumber {

   
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner (System.in);
        System.out.println("Enter your positive value = ");
        num = input.nextInt();
        int count = 0;
        for (int i = 2; i < num; i++) {
            if(num%i==0)
            {
                count++;
                break;
            }
            
        }
        if(count==0)
        {
            System.out.println("prime number\n");
        }
        else
            
        {
            System.out.println("not prime num\n");
        }
    }
    
}
