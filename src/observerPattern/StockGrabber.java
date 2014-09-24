package observerPattern;

import java.util.ArrayList;

public class StockGrabber implements Subject{
	private ArrayList<Observer> observers;
	private double ibmPrice;
	private double aaplPrice;
	private double googPrice;
	
	public StockGrabber(){
		observers = new ArrayList<Observer>();
	}
	
	@Override
	public void register(Observer observer) {
		observers.add(observer);
		
	}

	@Override
	public void unregister(Observer observer) {
		int observerIndex = observers.indexOf(observer);
		observers.remove(observerIndex);
		
	}

	@Override
	public void notifyObserver() {
		for(Observer observer: observers){
			observer.update(ibmPrice, aaplPrice, googPrice);
		}
		
	}

	public double getIbmPrice() {
		return ibmPrice;
	}

	public void setIbmPrice(double ibmPrice) {
		this.ibmPrice = ibmPrice;
		notifyObserver();
	}

	public double getAaplPrice() {
		return aaplPrice;
	}

	public void setAaplPrice(double aaplPrice) {
		this.aaplPrice = aaplPrice;
		notifyObserver();
	}

	public double getGoogPrice() {
		return googPrice;
	}

	public void setGoogPrice(double googPrice) {
		this.googPrice = googPrice;
		notifyObserver();
	}

}
