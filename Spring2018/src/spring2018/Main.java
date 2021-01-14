
package spring2018;


public class Main {
    public static void main(String[] args) {
     Student S1 = new Student("a","12","Dhanmondhi");
     Student S2 = S1;
    S2.setName("ABC");
    S2.setId("173-35-2262");
    S2.setAddress("Mirpur");
        System.out.println("Name = "+S2.getName());
        System.out.println("ID = "+S2.getId());
        System.out.println("Address = "+S2.getAddress());
       
        
       
        
    }
}
