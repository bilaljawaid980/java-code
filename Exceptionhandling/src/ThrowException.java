
public class ThrowException {
	
	static void fun(){
		try{
			throw new NullPointerException("DEMO");
		}
		catch(NullPointerException e){
			System.out.println("CAUGHT IN FUN");
			e.getMessage();
//			throw e;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try{
	fun();
}
catch(NullPointerException e){
	System.out.println("CAUGHT IN MAIN");
}
	}

}
