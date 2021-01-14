
package inheritingprivatememberoop21;


public class Teacher extends Person {
   private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
   void DI(){
        System.out.println(getName());
        System.out.println(getId());
        System.out.println(getAge());
   }
}
