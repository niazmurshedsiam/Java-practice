
package oop1;


public class Test {
    public static void main(String[] args) {
        Teacher teacher1;
        teacher1 = new Teacher();
        teacher1.name = "A";
        teacher1.gender = "male";
        teacher1.phone = 1721672707;
        System.out.println("Name = "+teacher1.name);
        System.out.println("Gender = "+teacher1.gender);
        System.out.println("Phone = "+teacher1.phone);
         Teacher teacher2;
        teacher2 = new Teacher();
        teacher2.name = "b";
        teacher2.gender = "female";
        teacher2.phone = 1721672705;
        System.out.println("Name = "+teacher2.name);
        System.out.println("Gender = "+teacher2.gender);
        System.out.println("Phone = "+teacher2.phone);
    }
}
