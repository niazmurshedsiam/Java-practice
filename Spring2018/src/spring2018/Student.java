
    
package spring2018;


public class Student {
  private String name;
private String Id;
private String address;
Student(String name,String Id,String address){
    this.name=name;
    this.Id=Id;
    this.address=address;
    //System.out.println("The name is: "+name,"this id is "+Id,"the address is "+address);
    
}
public String getName(){
    return name;
}
public void setName(String name){
    this.name=name;
}
public String getId(){
    return Id;
}
public void setId(String Id){
    this.Id=Id;
}
public String getAddress(){
    return address="Dhanmondhi";
}
public void setAddress(String address){
    this.address=address;
}
}

