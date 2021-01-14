
package series1mul2muln;

import java.util.Scanner;


public class SERIES1mul2muln {

    
    public static void main(String[] args) {
       int n,sum=1;
       Scanner input = new Scanner(System.in);
       System.out.println("Enter your input = ");
       n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            sum=sum*i;
            System.out.println(i+"");
        }
        System.out.println(sum);
        
    }
    
}
