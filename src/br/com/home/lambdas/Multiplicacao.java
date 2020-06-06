package br.com.home.lambdas;

public class Multiplicacao implements ICalculo{

	@Override
	public double executar(double a, double b) {
		return a * b;
	}

}
