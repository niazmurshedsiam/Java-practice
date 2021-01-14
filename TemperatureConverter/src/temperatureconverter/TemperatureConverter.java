
package temperatureconverter;

import java.util.Scanner;


public class TemperatureConverter {

    
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
       float cent,farn;
       System.out.println("Enter your input = ");
       farn = input.nextFloat();
       cent=(float) (1.8*farn+32);
       System.out.println("Cent is"+cent);
    }
    
    
}
