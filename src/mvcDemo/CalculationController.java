package mvcDemo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculationController {
	
	private CalculationView calculationView;
	private CalculationModel calculationModel;
	
	public CalculationController(CalculationView calculationView, CalculationModel calculationModel){
		this.calculationView = calculationView;
		this.calculationModel = calculationModel;
		
		this.calculationView.addCalculationListener(new CalculateListener());
	}
	
	class CalculateListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			calculationModel.add(calculationView.getFirstNumber(),calculationView.getSecondNumber());
			calculationView.setCalculationValue(calculationModel.getCalculationValue());
			
		}
		
	}

}
