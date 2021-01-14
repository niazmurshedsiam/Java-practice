
package foreasylooparraylist;

import java.util.ArrayList;

public class ForEasyloopArraylist {

    
    public static void main(String[] args) {
 ArrayList<Integer> num = new ArrayList<Integer>();
        System.out.println("size is = "+num.size());
        num.add(10);
        num.add(20);
        num.add(30);
        num.add(40);
        for(int x : num)
            System.out.print(" "+x);
        System.out.println("");
          System.out.println("size is = "+num.size());
                 
    }
     
   
    
    
}
