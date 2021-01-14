
package staticvariable;


public class Student {
   String name;
   String id;
   static String university_name="DIU";
   Student(String name,String id){
       this.name=name;
       this.id=id;
   
       
   }
   void DI(){
       System.out.println("Name = "+name);
       System.out.println("Id = "+id);
       System.out.println("University_name = "+university_name);
   }
}
