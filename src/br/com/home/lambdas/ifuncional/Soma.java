package br.com.home.lambdas.ifuncional;

public class Soma implements ICalculo{

	@Override
	public double executar(double a, double b) {
		return a + b;
	}

}
