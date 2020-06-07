package br.com.home.lambdas.predicate;

import java.util.function.Predicate;

public class PredicadoComposicaoMain {
	
	public static void main(String[] args) {
		
		System.out.println(isPar().and(isTresDigitos()).negate().test(124));
		System.out.println(isPar().or(isTresDigitos()).test(123));
	}

	private static Predicate<Integer> isTresDigitos() {
		return num -> num >= 100 && num <= 999;
	}

	private static Predicate<Integer> isPar() {
		return num -> num % 2 == 0;
	}

}
