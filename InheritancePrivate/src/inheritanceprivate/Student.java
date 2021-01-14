
package inheritanceprivate;


public class Student extends Person {
 private String cgpa;
 public String getCgpa(){
     return cgpa;
 }
 public void setCgpa(String cgpa){
     this.cgpa=cgpa;
 }
 void DI1(){
     DI();
     System.out.println(getCgpa());
 }
}
