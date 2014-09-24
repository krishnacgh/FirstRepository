package observerPattern;

public class StockObserver implements Observer{
	private double ibmPrice;
	private double aaplPrice;
	private double googPrice;
	private static int observerIdTracker = 0;
	private int observerId;
	
	private Subject stockGrabber;
	
	public StockObserver(Subject stockGrabber){
		this.stockGrabber = stockGrabber;
		this.observerId = ++observerIdTracker;
		System.out.println("New Observer "+ this.observerId);
		stockGrabber.register(this);
	}
	@Override
	public void update(double ibmPrice, double aaplPrice, double googPrice) {
		this.googPrice = googPrice;
		this.ibmPrice = ibmPrice;
		this.aaplPrice = aaplPrice;
		
		System.out.println(observerId + "\nIBM: " +this.ibmPrice +
		observerId + "\nAAPL: " +this.aaplPrice +
		observerId + "\nGOOG: " +this.googPrice +"\n");
		
	}
	
}
