package br.com.home.lambdas.foreach;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForeachMain {
	
	public static void main(String[] args) {
		List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia", "Gui");
		
		System.out.println("Forma tradicional...");
		for(String nome: aprovados) {
			System.out.println(nome);
		}
		
		System.out.println("\nLambda #01...");
		aprovados.forEach(nome -> System.out.println(nome + "!"));
		
		System.out.println("\nMethod Reference #01...");
		aprovados.forEach(System.out::println);
		
		System.out.println("\nLambda #02...");
		Consumer<? super String> consumer = ForeachMain::imprimir;
		aprovados.forEach(consumer);
	}
	
	static void imprimir(String nome) {
		System.out.println(String.format("My name is %s", nome));
	}

}
