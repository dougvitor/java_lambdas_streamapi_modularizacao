package br.com.home.lambdas;

public class CalculoMainPreLambda {
	
	public static void main(String[] args) {
		
		ICalculo soma = new Soma();
		ICalculo multiplicacao = new Multiplicacao();
		
		System.out.println(soma.executar(75, 2));
		System.out.println(multiplicacao.executar(75,2));
		
	}

}
