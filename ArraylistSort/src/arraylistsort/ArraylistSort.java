
package arraylistsort;

import java.util.ArrayList;

import java.util.Collections;


public class ArraylistSort {

   
    public static void main(String[] args) {
         ArrayList<Integer> num = new ArrayList<Integer>();
         num.add(10);
         num.add(20);
         num.add(30);
         num.add(40);
         Collections.sort(num);
         System.out.println(""+num);
         Collections.sort(num,Collections.reverseOrder());
         System.out.println(""+num);
         
      
         
         
    }
    
}
