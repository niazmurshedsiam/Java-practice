
package polymorphismoop34;

public class Test {
    public static void main(String[] args) {
        Shape S1 =new Shape();
        Rectangle R1 = new Rectangle(10,20);
        Triangle T1 = new Triangle(20,15);
        System.out.println("Shape = "+S1.Area());
        System.out.println("Triangle = "+T1.Area());
        System.out.println("Rectangle = "+R1.Area());
    }
  
}
