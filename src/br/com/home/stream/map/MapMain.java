package br.com.home.stream.map;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class MapMain {

	public static void main(String[] args) {

		Consumer<String> print = System.out::print;
		
		List<String> marcas = Arrays.asList("BMW ", "audi ", "honda ");
		marcas.stream().map(m -> m.toUpperCase()).forEach(print);
		
		UnaryOperator<String> maiuscula = n -> n.toUpperCase();
		UnaryOperator<String> primeiraLetra = n -> String.valueOf(n.charAt(0));
		UnaryOperator<String> exclamacoes = n -> n + "!!!! ";
		
		System.out.println("\n\nUsando Composição...");
		marcas
			.stream()
			.map(maiuscula)
			.map(primeiraLetra)
			.map(exclamacoes)
			.forEach(print);
	}

}
