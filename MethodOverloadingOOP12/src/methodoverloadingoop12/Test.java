
package methodoverloadingoop12;


public class Test {
    public static void main(String[] args) {
        MethodOverloading MO = new MethodOverloading();
        MO.ab(5, 6);
        MO.ab(5, 6, 8);
        MO.ab(4.4, 5.5);
        MO.ab();
    }
}
