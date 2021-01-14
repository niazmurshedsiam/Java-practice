
package switchpart1;

import java.util.Scanner;


public class Switchpart1 {

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
                case 2:
                System.out.println("two\n");
                break;
             case 3:
                System.out.println("three\n");
                break;
             
                 case 4:
                System.out.println("four\n");
                break;
                case 5:
                System.out.println("Five\n");
                break;
                case 6:
                System.out.println("six\n");
                break;
                case 7:
                System.out.println("seven\n");
                break;
                case 8:
                System.out.println("eight\n");
                break;
                default:
                    
                System.out.println("not digit\n");
                 
    }

    
    }
    
}
