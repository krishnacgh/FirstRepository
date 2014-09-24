package strategyPattern;

public class AnimalTest {
	
	public static void main(String args[]){
		Animal doggy = new Dog();
		System.out.println("Doggy " +doggy.testFly());
		Animal birdy = new Bird();
		System.out.println("Birdy " +birdy.testFly());
		doggy.setFlys(new ICanFly());
		System.out.println("Doggy " +doggy.testFly());
	}

}
