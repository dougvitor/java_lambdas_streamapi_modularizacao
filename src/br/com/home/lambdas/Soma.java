package br.com.home.lambdas;

public class Soma implements ICalculo{

	@Override
	public double executar(double a, double b) {
		return a + b;
	}

}
