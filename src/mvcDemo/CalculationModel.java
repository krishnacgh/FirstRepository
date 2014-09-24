package mvcDemo;

public class CalculationModel {
	
	private double calculationValue;
	
	public void add(double firstNumber, double secondNumber){
		calculationValue = firstNumber + secondNumber;
	}

	public double getCalculationValue() {
		return calculationValue;
	}

	public void setCalculationValue(double calculationValue) {
		this.calculationValue = calculationValue;
	}
}
