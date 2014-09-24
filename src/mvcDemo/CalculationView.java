package mvcDemo;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculationView extends JFrame{
	
	private JTextField firstNumber = new JTextField(10);;
	private JLabel plusLabel = new JLabel("+");
	private JTextField secondNumber = new JTextField(10);
	private JButton calculate = new JButton("Calculate");
	private JTextField calculationValue = new JTextField(10);
	
	public CalculationView(){
		JPanel calPanel = new JPanel();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 200);
		calPanel.add(firstNumber);
		calPanel.add(plusLabel);
		calPanel.add(secondNumber);
		calPanel.add(calculate);
		calPanel.add(calculationValue);
		this.add(calPanel);
		
	}
	
	public double getFirstNumber(){
		return Double.parseDouble(firstNumber.getText());
	}
	
	public double getSecondNumber(){
		return Double.parseDouble(secondNumber.getText());
	}
	
	public double getCalculationValue(){
		return Double.parseDouble(calculationValue.getText());
	}
	
	public void setCalculationValue(double calculationValue){
		this.calculationValue.setText(Double.toString(calculationValue));
	}

	void addCalculationListener(ActionListener listenForCalculate){
		calculate.addActionListener(listenForCalculate);
	}
	
	void displayErrorMessage(String errorMessage){
		JOptionPane.showMessageDialog(this, errorMessage);
	}
	
	

}
