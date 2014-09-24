package strategyPattern;

public class Bird extends Animal{

	public Bird(){
		flys = new ICanFly();
	}

}
