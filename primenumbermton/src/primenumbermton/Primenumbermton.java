
package primenumbermton;

import java.util.Scanner;

public class Primenumbermton {


    public static void main(String[] args) {
              int m,n;
        Scanner input = new Scanner (System.in);
        System.out.println("Enter your positive value = ");
        m = input.nextInt();
        System.out.println("Enter your positive value = ");
        n = input.nextInt();
        int count = 0;
        for (int j = m; j < n; j++) {
            
        
        for (int i = 2; i <= j-1; i++) {
            if(j%i==0)
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
}
    

