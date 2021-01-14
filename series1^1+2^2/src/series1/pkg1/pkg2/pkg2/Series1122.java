
package series1.pkg1.pkg2.pkg2;

import java.util.Scanner;


public class Series1122 {

    
    public static void main(String[] args) {
            int n,sum=0;
      Scanner input = new Scanner (System.in);
      System.out.println("enter your input = ");
      n = input.nextInt();
        for (int i = 1; i <= n; i=i+1) {
            
            sum=sum+i*i;
            System.out.println(i+"X"+i+"");
        }
        System.out.println(sum);
       
    }
       
    }
    

