
package sortnameprint;

import java.util.Arrays;


public class SortNamePrint {

   
    public static void main(String[] args) {
       String name[]={"siam","sadnan","mahatia","omar","niaz"};
       Arrays.sort(name);
        for (int i = 0; i < 5; i++) {
            System.out.print(name[i]+" ");
            
        }
        System.out.println("");
        for (int i = 4; i >= 0; i--) {
            System.out.print(name[i]+" ");
            
        }
    }
    
}
