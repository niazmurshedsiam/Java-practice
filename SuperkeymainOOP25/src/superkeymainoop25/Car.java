
package superkeymainoop25;

public class Car extends Vechle {
   int gear;
   Car(String c,Double w, int g){
       super(c,w);
       gear =g;
       
   }
   void DI(){
       super.DI();
       System.out.println("Gear = "+gear);
   }
}
