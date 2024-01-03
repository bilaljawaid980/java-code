import java.util.ArrayList;
import java.util.Scanner;

public class Cars {
    
    ArrayList<String> cars = new ArrayList<String>();
    Scanner myObj = new Scanner(System.in);

    public void addElements() {
        System.out.println("Enter the number of cars:");
        int numberOfCars = myObj.nextInt();

        // Consume the newline character left in the buffer
        myObj.nextLine();

        // Use a for loop to get the names of the cars
        for (int i = 0; i < numberOfCars; i++) {
            System.out.print("Enter the name of car #" + (i + 1) + ": ");
            String carName = myObj.nextLine();

            // Add the car name to the ArrayList
            cars.add(carName);
        }
    }

    public void display() {
        System.out.println("List of Cars:");
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
    }
}



