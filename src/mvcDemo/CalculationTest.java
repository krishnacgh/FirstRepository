package mvcDemo;

public class CalculationTest {
	
	public static void main(String args[]){
		CalculationView calculationView = new CalculationView();
		CalculationModel calculationModel = new CalculationModel();
		CalculationController calculationController = new CalculationController(calculationView, calculationModel);
		calculationView.setVisible(true);
	}

}
