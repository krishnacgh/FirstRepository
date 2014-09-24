package strategyPattern;

public abstract class Animal {
	public Flys flys = null;
	
	public void setFlys(Flys flys){
		this.flys = flys;
	}
	
	public String testFly() {
		return flys.fly();
		
	}

}
