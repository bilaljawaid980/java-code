
public abstract class Animal {
	public Animal(){
		System.out.println("ANIMAL CLASS CONSTRUCTOR BEEN CERATED ");
	}

	String colour;
	String pattern;
	
	public abstract void makeSound();
	public abstract void eat();
	public abstract void run();
	public void place(){
		System.out.println("ANIMALS IN KARACHI");
	}
	
}




