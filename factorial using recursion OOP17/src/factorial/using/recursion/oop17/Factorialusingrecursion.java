
package factorial.using.recursion.oop17;

public class Factorialusingrecursion {
    int fact (int n){
        if(n==1){
            return 1;
        }
        else 
        {
           return n*fact(n-1);
        }
            }
}
