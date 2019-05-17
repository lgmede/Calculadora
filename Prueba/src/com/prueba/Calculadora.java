package com.prueba;

public class Calculadora {

	public String suma(String num1, String num2) {
		int resultado = 0;
		
		resultado = Integer.parseInt(num1) + Integer.parseInt(num2); 
		return Integer.toString(resultado);
	}
	
}
