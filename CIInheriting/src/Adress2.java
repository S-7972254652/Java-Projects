public class Adress2 {  
private String addressLine1,city,state,country;  
  
public Adress2(String addressLine1, String city, String state, String country) {  
    super();  
    this.addressLine1 = addressLine1;  
    this.city = city;  
    this.state = state;  
    this.country = country;  
}  
public java.lang.String toString(){  
    return addressLine1+" "+city+" "+state+" "+country;  
}  
  
}  