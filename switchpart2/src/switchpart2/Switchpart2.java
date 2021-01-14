
package switchpart2;

import java.util.Scanner;


public class Switchpart2 {

    
    public static void main(String[] args) {
              Scanner input = new Scanner (System.in);
        int digit;
        System.out.println("Enter your input =");
        digit = input.nextInt();
        switch(digit){
            
            case 0:
                System.out.println("zero\n");
                break;
             case 1:
                System.out.println("one\n");
                break;
             case 3:
                System.out.println("three\n");
                break;
             
              
                default:
                    
                System.out.println("not digit\n");
                 
    }

    
    }
    }
    

