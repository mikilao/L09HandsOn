package rachel.handson9;

import java.util.ArrayList;
import java.util.List;

public class HandsOn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Animal> animalList = new ArrayList<Animal>();
		
	        AnimalFactory factory = new AnimalFactory();
	        String animalType;
		
	
	
	// theres no way  would have come up with this by now fr fr the directions were too vague.
	 // query input from user util `exit`
    do {
        System.out.print("Enter animal name or exit: ");
        animalType = StudentHelper.ReadInputString();
        if(!animalType.equalsIgnoreCase("exit")) {
            Animal animal = factory.getAnimal(animalType);
            if(animal != null) animalList.add(animal);
        }
    }
    while(!animalType.equalsIgnoreCase("exit"));

    // process results
	 int numCats = 0, numDogs = 0, numCows = 0;
	 for(Animal animal: animalList) {
         if(animal instanceof Cat) {
             numCats++;
         }
         else if(animal instanceof Dog) {
             numDogs++;
         }
         else if(animal instanceof Cow) {
             numCows++;
         }
     }
System.out.println("RESULTS:");
System.out.println("Num cats = " + numCats);
System.out.println("Num dogs = " + numDogs);
System.out.println("Num cows = " + numCows);
}
 }
