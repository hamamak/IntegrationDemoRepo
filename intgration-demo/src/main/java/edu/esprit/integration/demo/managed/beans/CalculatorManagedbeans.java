package edu.esprit.integration.demo.managed.beans;

import edu.esprit.integration.demo.services.CalculatorServices;


public class CalculatorManagedbeans {

	
	CalculatorServices calService = new CalculatorServices();
	
	private int a;
	
	private int b;
	
	private String choice;
	
	
	public int getResult(){
		
		return 0;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public String getChoice() {
		return choice;
	}

	public void setChoice(String choice) {
		this.choice = choice;
	}
	

}
