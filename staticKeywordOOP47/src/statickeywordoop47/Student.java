
package statickeywordoop47;

public class Student {
   String name;
   String Id;
   static String University_name = "DIU";
   Student(String n,String I){
       name = n;
       Id = I;
       
   }
   void DI(){
       System.out.println("Name = "+name);
       System.out.println("ID = "+Id);
       System.out.println("University Name = "+University_name);
   }
}
