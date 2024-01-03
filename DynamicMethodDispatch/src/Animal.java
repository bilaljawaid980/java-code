//
//public class Animal {
//	
//	//wide casting
//	
//	
//	int x=5;
//	double y=x;
//	
//	//narrow casting 
//	
//double z=5.5;
//
//void sound(){
//	System.out.println("NOT SPECIFIED");
//}
//void run(){
//	System.out.println("IT RUNS");
//}
//
//}
//class cat extends Animal{
//	void sound(){
//		System.out.println("MEOW");
//	}
//}

class Animal {
    void eat() {
        System.out.println("Animal is eating.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking.");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing.");
    }
}