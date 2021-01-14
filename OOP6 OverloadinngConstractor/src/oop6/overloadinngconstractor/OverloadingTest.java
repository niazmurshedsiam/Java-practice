
package oop6.overloadinngconstractor;

public class OverloadingTest {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.DI();
         Teacher t2 = new Teacher("karim","male");
        t2.DI();
        Teacher t3 = new Teacher("karim","male",20);
        t3.DI();
    }
   
}
