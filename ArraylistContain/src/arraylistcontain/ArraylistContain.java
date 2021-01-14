
package arraylistcontain;

import java.util.ArrayList;


public class ArraylistContain {

   
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<Integer>(); 
        System.out.println("size is = "+num.size());
      num.add(10);
      num.add(20);
      num.add(30);
      num.add(40);
        System.out.println(num);
        System.out.println("size is = "+num.size());
         
         boolean check = num.isEmpty();
         System.out.println(" "+check);
          boolean contain = num.contains(30);
         System.out.println(" "+contain);
        int  index = num.indexOf(40);
        System.out.println(" "+index);
        num.set(3, 60);
        System.out.println(" "+num);
        int x = num.get(0);
        System.out.println("index 0 = "+x);
    }
    
}
