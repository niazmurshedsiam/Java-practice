
package staticvariable1;


public class Student {
  static int count =0;
   Student(){
       count++;
       
   }
   void DI(){
       System.out.println("Student Count = "+count);
   }
}
