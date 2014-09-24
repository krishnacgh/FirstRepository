package strategyPattern;

public class Dog extends Animal{
	public Dog(){
		flys = new ICantFly();
	}
}
