package observerPattern;

public class GrabStocks {
	
	public static void main(String args[]){
		
		StockGrabber stockGrabber = new StockGrabber();
		
		StockObserver observer1 = new StockObserver(stockGrabber);
		
		
		
		stockGrabber.setIbmPrice(197.00);
		stockGrabber.setAaplPrice(677.60);
		stockGrabber.setGoogPrice(676.40);
		
		StockObserver observer2 = new StockObserver(stockGrabber);
		
		stockGrabber.setIbmPrice(200.0);
		stockGrabber.setAaplPrice(300.0);
		stockGrabber.setGoogPrice(400.0);
	}

}
