
package variablelengthargumentsoop16;

public class Variablelengtharguments {
    void ab(int...x){
        int sum = 0;
        for(int i : x){
            sum = sum+i;
            
        }
        System.out.println(sum);
    }
}
