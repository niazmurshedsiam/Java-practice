
package thisclassoop27;

public class Person {
 String name;
 int age;
 String hairclour;
 Person(String name,int age){
     this.name=name;
     this.age=age;
     
 }
 Person(String name, String hairclour,int age){
     this(name,age);
     this.hairclour = hairclour;
 }
 void DI(){
     System.out.println("Name = "+name);
     System.out.println("Age = "+age);
     System.out.println("Hairclour = "+hairclour);
 }
}
