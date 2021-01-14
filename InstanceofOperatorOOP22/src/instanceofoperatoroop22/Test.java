
package instanceofoperatoroop22;


public class Test {
    public static void main(String[] args) {
        Animal A = new Animal();
        Person P = new Person();
        Teacher T = new Teacher();
        System.out.println(A instanceof Animal);
        System.out.println(P instanceof Animal);
        System.out.println(T instanceof Animal);
        System.out.println(T instanceof Person);
        System.out.println(P instanceof Person);
        System.out.println(A instanceof Teacher);
        System.out.println(T instanceof Teacher);
    }
  
}
