
package polymorphismoop33;

public class Test {
    public static void main(String[] args) {
        Person P1 = new Person();
        P1.DI();
        P1 = new Teacher();
        P1.DI();
        P1 = new Student();
        P1.DI();
    }
  
}
