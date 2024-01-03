public class cat extends Animal{
	public cat(){
		super();
		System.out.println("CAT CLASS CONSTRUCTOR");
	}

	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("meow");
	}
	public void attack(){
		
		System.out.println("IT DON'T ATTACK");
	}
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	}
