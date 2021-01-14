
package arraylist;

import static java.nio.file.Files.size;
import java.util.ArrayList;

public class Arraylist {

    
    public static void main(String[] args) {
       ArrayList<Integer> num1 = new ArrayList<Integer>();
       ArrayList<Integer> num2 = new ArrayList<Integer>();
       ArrayList<Integer> num3 = new ArrayList<Integer>();
      
        num1.add(10);
        num1.add(20);
        num1.add(30);
        num1.add(40);
        System.out.println("number1 is = "+num1);
        num2.add(50);
        num2.add(60);
        num2.add(70);
        num2.add(80);
        System.out.println("number2 is = "+num2);
        num3.addAll(num1);
        System.out.println("number3 is = "+num3);
        boolean result = num1.equals(num3);
        System.out.println(""+result);
        boolean result1 = num1.equals(num2);
        System.out.println(""+result1);
        
    }
    
}
