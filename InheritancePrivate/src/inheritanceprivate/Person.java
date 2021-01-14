
package inheritanceprivate;


public class Person {
  private String name;
private int age; 
public String getName(){
    return name;
}
public void setName(String name){
    this.name=name;
}
public int getAge(){
    return age;
}
public void setAge(int age){
    this.age=age;
}
void DI(){
    System.out.println(getName());
    System.out.println(getAge());
}
}
