package rachel.handson9;

public class AnimalFactory {
	//the method is getAnimal but the type of animal is set in the 'Main' method
    public Animal getAnimal(String animalType) {
    	
        if(animalType.equalsIgnoreCase("cow")) {
            return new Cow();
        }
        else if(animalType.equalsIgnoreCase("dog")) {
            return new Dog();
        }
        else if(animalType.equalsIgnoreCase("cat")) {
            return new Cat();
        }
        else {
          
            System.out.println("Unknown");
            return null;
        }
    }
}