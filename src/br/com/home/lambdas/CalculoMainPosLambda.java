package br.com.home.lambdas;

public class CalculoMainPosLambda {
	
	public static void main(String[] args) {
		
		ICalculo soma = (x, y) -> { return x + y; };
		ICalculo multiplicacao = (x, y) -> x * y;
		
		System.out.println(soma.executar(75, 2));
		System.out.println(multiplicacao.executar(75,2));
		
	}

}
