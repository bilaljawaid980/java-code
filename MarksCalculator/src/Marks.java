import java.util.ArrayList;
import java.util.Scanner;
public class Marks {
 
ArrayList<Float>marks=new ArrayList<Float>();
Scanner myObj=new Scanner(System.in);


int sub;
public void marksInput(){
	System.out.println("TOTAL NUMER OF SUBJECTS");
	myObj.nextInt();
	for(int i=0;i<sub;i++){
		System.out.println("ENTER YOUR MARKS # "+(i+1)+":");
		float maks=myObj.nextFloat();
		marks.add(maks);
	}
}
	
}
