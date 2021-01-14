
package vowelconsoant;

import java.util.Scanner;


public class Vowelconsoant {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char num;
        System.out.println("Enter Your input = ");
        num = input.next().charAt(0);
        if(num=='a'||num=='e'||num=='i'||num=='o'||num=='u')
            System.out.println("Vowel is "+num);
        else
            System.out.println("Consonant is "+num);
            
        
    }
    
}
