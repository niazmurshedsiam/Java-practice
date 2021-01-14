
package methodoverridingoop22;


public class Test {
    public static void main(String[] args) {
        Teacher T1 = new Teacher();
        T1.name = "Karim";
        T1.Id = "173-35-2262";
        T1.age = 34;
        T1.DI();
        Person P1 = new Person();
        P1.name = "Asraf";
        P1.age = 34;
        P1.DI();
    }
 
}
