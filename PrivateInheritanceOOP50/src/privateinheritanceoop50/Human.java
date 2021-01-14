
package privateinheritanceoop50;

public class Human extends Person {
 private int  age;
 public int getage(){
     return age;
     
 }
 public void setage(int age){
     this.age=age;
     
 }
 void DI(){
     System.out.println("Name = "+getname());
     System.out.println("Gender = "+getgender());
     System.out.println("Age = "+getage());
 }
 
 
}
