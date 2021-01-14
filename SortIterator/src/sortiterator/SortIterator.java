
package sortiterator;

import java.util.ArrayList;
import java.util.Iterator;

public class SortIterator {

   
    public static void main(String[] args) {
     ArrayList<Integer> num = new ArrayList<Integer>();
        System.out.println("size is = "+num.size());
        num.add(10);
        num.add(20);
        num.add(30);
        Iterator itr = num.iterator();
        while(itr.hasNext()){
        System.out.println(" "+itr.next());
        }
    }
    
}
