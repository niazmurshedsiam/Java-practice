
package methodoverloadingoop12;


public class MethodOverloading {
    void ab(int a, int b){
        System.out.println(a+b);
    }
    void ab(int a, int b,int c){
        System.out.println(a+b+c);
    }
    void ab(double a, double b){
        System.out.println(a+b);
    }
    void ab()
    {
        System.out.println("not value");
    }
}
