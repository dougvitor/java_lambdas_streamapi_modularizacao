package br.com.home.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {

	public static void main(String[] args) {
		
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6 , 7, 8, 9);
		
		Function<Integer, String> intToBinaryString = Integer::toBinaryString; // Podia ter jogado esse method reference direto no map
		
		UnaryOperator<String> inverterString = s -> new StringBuilder(s).reverse().toString();
		
		Function<String, Integer> binaryToInt = s -> Integer.parseInt(s, 2);
		
		numeros
			.stream()
			.map(intToBinaryString)
			.map(inverterString)
			.map(binaryToInt)
			.forEach(System.out::println);

	}

}
