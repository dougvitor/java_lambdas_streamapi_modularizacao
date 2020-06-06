package br.com.home.lambdas;

import java.util.function.BinaryOperator;

public class CalculoMainUsandoInterfaceFuncionalJava {
	
	public static void main(String[] args) {
		
		BinaryOperator<Double> calc = (x, y) -> { return x + y; };
		System.out.println(calc.apply(2d, 3d));
		
		calc = (x, y) -> { return x * y; };
		System.out.println(calc.apply(2d, 3d));
		
	}

}
