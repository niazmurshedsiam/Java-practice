
package classwork;

public class ClassWork {

    
    public static void main(String[] args) {
        System.out.println("Hello Word");
        Bike bike1;
        bike1 = new Bike();
        bike1.setName("jonson");
        bike1.setModel("50");
        bike1.setSpeed(0);
        System.out.println("Bike Name = "+bike1.getName());
        System.out.println("Bike Model = "+bike1.getModel());
        System.out.println("Bike Speed = "+bike1.getSpead());
        
    }
    
}
