
package overloadingconstructoroop44;


public class Test {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher();
        Teacher teacher2 = new Teacher("a","male",2);
        teacher2.DI();
        Teacher teacher3 = new Teacher("b","female");
         teacher3.DI();
    }
  
}
