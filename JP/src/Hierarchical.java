class Animals{  
void eat(){System.out.println("eating...");}  
}  
class Doggy extends Animals{  
void bark(){System.out.println("barking...");}  
}  
class Cat extends Animals{  
void meow(){System.out.println("meowing...");}  
}  
class Hierarchical{  
public static void main(String args[]){  
Cat c=new Cat();  
c.meow();
c.eat();  
//c.bark();//C.T.Error  
}}  