package rachel.handson9;

public class Cat extends Animal{
	//empty constructor the inherits the attributes from Animal through 'super'
		public Cat(){
		super(new Animal.AnimalBuilder("cat", 1, 350 , 18));
		}
}
