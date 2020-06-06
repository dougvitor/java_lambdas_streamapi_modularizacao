package br.com.home.lambdas.function;

import java.util.function.Function;

public class FunctionMain {
	
	public static void main(String[] args) {
		
		Function<Integer, String> parOuImpar = numero ->  numero % 2 == 0 ? "Par" : "Ímpar";
		
		Function<String, String> mensagemResultado = valor -> String.format("O resultado é: %s", valor);
		
		System.out.println(parOuImpar.apply(33));
				
		String resultado = parOuImpar
								.andThen(mensagemResultado)
								.apply(32);
		
		System.out.println(resultado);
		
	}

}
