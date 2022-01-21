package rachel.handson9;

public class Cow extends Animal{
	//empty constructor the inherits the attributes from Animal through 'super'
	public Cow(){
	super(new Animal.AnimalBuilder("cow", 1, 350 , 18));
	}
}