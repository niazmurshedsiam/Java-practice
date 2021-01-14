
package armstrong.number;

import java.util.Scanner;


public class ArmstrongNumber {

    public static void main(String[] args) {
           int temp,sum=0,x;
    Scanner input = new Scanner(System.in);
    System.out.println("enter your any number = ");
    int num;
 
    num = input.nextInt();
     temp = num;
    while(temp!=0)
    {
     x = temp%10;
     sum = sum+x*x*x;
     temp = temp/10;
    }
    if(num==sum)
    {
        System.out.println("armstrong number\n");
    }
    else
    {
       System.out.println("not armstrong number\n"); 
    }
    }
    
}
