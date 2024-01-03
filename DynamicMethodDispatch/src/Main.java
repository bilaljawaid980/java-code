//
//public class Main {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//Animal a1=new Animal();
//cat a2=new cat();
//Animal a3=new cat();
//a1.sound();
//a2.sound();
//System.out.println(a1.y);
//a2.run();
//a3.run();
//
//if(Animal instanceOf cat){
//	cat cat=(cat)Animal;
//}
//	}
//
//}




public class Main {
    public static void main(String[] args) {
        // Upcasting: Dog is treated as an Animal
        Animal animal = new Dog();
        animal.eat(); // Accessing the eat() method from Animal

        // Downcasting: Animal is cast back to Dog
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.bark(); // Accessing the bark() method from Dog
        }

        // Attempting to downcast to a different subclass
        if (animal instanceof Cat) {
            // This block will not be executed, as the animal is not an instance of Cat
            Cat cat = (Cat) animal; // ClassCastException will occur here
            cat.meow();
        }
    }
}
