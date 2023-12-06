public class Employee4 {  
private int id;  
private String name;  
private Address address;  
public Employee4() {}  
  
public Employee4(int id, String name) {  
    super();  
    this.id = id;  
    this.name = name;  
}  
public Employee4(int id, String name, Address address) {  
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