
package capitalsmallletter;

import java.util.Scanner;


public class CapitalSmallletter {

   
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int num;
        System.out.println("Enter Your Input = ");
        num = input.next().charAt(0);
        if(num>='a'&&num<='z')
            System.out.println("Small letter "+num);
        else  if(num>='A'&&num<='Z')
             System.out.println("Capital letter "+num);
        else
            System.out.println("Digit letter "+num);
            
        
    }

  
    }
    

