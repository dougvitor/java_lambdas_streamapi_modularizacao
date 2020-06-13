package br.com.home.stream.reduce;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1Main {

	public static void main(String[] args) {
		
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		BinaryOperator<Integer> somar = (acumulador, n) -> acumulador + n;
		
		Integer total1 = numeros.parallelStream().reduce(somar).get();
		System.out.println(total1);
		
		int total2 = numeros.parallelStream().reduce(100, somar);
		System.out.println(total2);
		
		int total3 = numeros.stream().reduce(100, somar);
		System.out.println(total3);
		
		double total4 = numeros.stream().reduce(100, (acumulador, n) -> acumulador - n);
		System.out.println(total4);
		
		numeros.stream()
			.filter(n -> n > 5)
			.reduce(somar)
			.ifPresent(System.out::println);
		
	}

}
