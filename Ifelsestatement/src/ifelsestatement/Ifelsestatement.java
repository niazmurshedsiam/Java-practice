
package ifelsestatement;

import java.util.Scanner;


public class Ifelsestatement {

    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
    int a;
    System.out.println("Enter your input = ");
    a = input.nextInt();
    if(a>0)
        System.out.println("positive " +a);
    else
        System.out.println("negative " +a);
    
    }
    
}
