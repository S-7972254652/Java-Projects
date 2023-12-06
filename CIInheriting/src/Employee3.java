public class Employee3 {  
private int id;  
private String name;  
private Address address;  
public Employee3() {}  
  
public Employee3(int id, String name) {  
    super();  
    this.id = id;  
    this.name = name;  
}  
public Employee3(int id, String name, Address address) {  
    super();  
    this.id = id;  
    this.name = name;  
    this.address = address;  
}  
  
void show(){  
    System.out.println(id+" "+name);  
    System.out.println(address);  
}  
}  