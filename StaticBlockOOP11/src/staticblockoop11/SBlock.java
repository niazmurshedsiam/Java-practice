
package staticblockoop11;


public class SBlock {
   static String name;
    static String id;
    static{
        id = "173-35-2262";
        name ="karim";
    }
    static void DI(){
        System.out.println("ID = "+id);
        System.out.println("Name = "+name);
    }
}
