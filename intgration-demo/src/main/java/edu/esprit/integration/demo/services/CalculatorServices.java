package edu.esprit.integration.demo.services;

public class CalculatorServices {

	
	private int a;
	
	private int b;
	
	
	
	public CalculatorServices() {
		
	}
	
	public int addition()
	{
		
		return a+b;
		
	}
	
	public int soustraction(){
		
		return a -b;
	}
	
	public int multiplication(){
		
		return a * b;
	}
	
	public double division (){
		int s=0;
		
            s = a/b;
        
        return s;
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
	
	

}
