
package removeclear;

import java.util.ArrayList;


public class Removeclear {

   
    public static void main(String[] args) {
     

     ArrayList<Integer> num = new ArrayList<Integer>(); 
        System.out.println("size is = "+num.size());
      num.add(10);
      num.add(20);
      num.add(30);
      num.add(40);
        System.out.println(num);
        System.out.println("size is = "+num.size());
         num.clear();
         boolean check = num.isEmpty();
         System.out.println(" "+check);
         boolean contain = num.contains(30);
         System.out.println(" "+contain);
    }
 
}

