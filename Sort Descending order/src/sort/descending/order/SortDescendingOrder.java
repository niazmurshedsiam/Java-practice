
package sort.descending.order;

import java.util.Arrays;


public class SortDescendingOrder {

   
    public static void main(String[] args) {
       int num[]={10,-2,-3,4,2};
       Arrays.sort(num);
        for (int i = 4; i >= 0; i--) {
            System.out.print(num[i]+" ");
            
        }
    }
    
}
