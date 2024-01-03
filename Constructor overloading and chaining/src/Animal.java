
public class Animal {
public Animal(){
	System.out.println("ANIMAL CONSTRUCTOR");
}
String type; String name;
public Animal(String type, String name){
this();
	this.type=type;
	this.name=name;
	System.out.println("animal tyoe is "+this.type+ " Name is "+this .name);
}
int age;
public Animal(int age){
	this("2 leg"," parrot");
	this.age=age;
	
}
}
