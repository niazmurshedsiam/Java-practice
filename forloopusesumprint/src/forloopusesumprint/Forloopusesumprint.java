
package forloopusesumprint;

import java.util.Scanner;

public class Forloopusesumprint {

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum=0;
        int m,n;
        System.out.println("input");
        m = input.nextInt();
        System.out.println("input");
        n = input.nextInt();
        for (int i = m; i <= n; i++) {
            if(i%2==0)
            {
            sum=sum+i;
            System.out.println(i);
            }
            
            
            
            
        }
        System.out.println("the sum number is = "+sum);
    }

   
    }
    

