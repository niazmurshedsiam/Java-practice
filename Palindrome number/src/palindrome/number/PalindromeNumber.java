
package palindrome.number;

import java.util.Scanner;

public class PalindromeNumber {

   
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
     sum = sum*10+x;
     temp = temp/10;
    }
    if(num==sum)
    {
        System.out.println("palindrome number\n");
    }
    else
    {
       System.out.println("not palindrome number\n"); 
    }
    }
    
}
