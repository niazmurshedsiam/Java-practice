
package arraysum;

import java.util.Scanner;


public class ArraySum {

    public static void main(String[] args) {
        int num[] = new int[5];
        int sum=0;
          Scanner input = new Scanner(System.in);
       System.out.println("Enter your number = ");
        for (int i = 0; i < 5; i++) {
             num[i] = input.nextInt();
        }
         for (int i = 0; i < 5; i++) {
             
             sum = sum+num[i];
             
        }
       System.out.println("sum is = "+sum);
       float avg = sum/5;
        System.out.println("average is = "+avg);
    }
    
}
