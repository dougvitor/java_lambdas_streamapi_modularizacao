package br.com.home.lambdas;

import br.com.home.lambdas.utils.NumeroPorExtenso;

@FunctionalInterface
public interface ICalculo {
	
	double executar(double a, double b);
	
	default String obterNumeroPorExtenso(double a, double b) {
		double numero = executar(a, b);
		return new NumeroPorExtenso(numero).toString();
	}

}
