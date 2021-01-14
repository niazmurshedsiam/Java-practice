
package supperkeyoop26;

public class Bike extends Vechle {
    int speed;
    Bike(String n,String m,int s){
        super(n,m);
        speed = s;
    }
    void DI(){
        super.DI();
        System.out.println("Speed ="+speed);
    }
}
