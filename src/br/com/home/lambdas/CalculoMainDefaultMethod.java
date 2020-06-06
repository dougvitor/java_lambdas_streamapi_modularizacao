package br.com.home.lambdas;

public class CalculoMainDefaultMethod {
	
	public static void main(String[] args) {
		
		ICalculo calc = (x,y) -> x + y;
		System.out.println(calc.obterNumeroPorExtenso(90, 7));
		
		calc = (x,y) -> x * y;
		System.out.println(calc.obterNumeroPorExtenso(90, 7));
		
	}

}
