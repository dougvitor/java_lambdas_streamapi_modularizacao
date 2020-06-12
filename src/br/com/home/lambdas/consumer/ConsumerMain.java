package br.com.home.lambdas.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import br.com.home.Produto;

public class ConsumerMain {
	
	public static void main(String[] args) {
		
		Consumer<Produto> imprimir = p -> System.out.println(p.getNome());
		
		Produto p1 = new Produto("Caneta", 15.35, 0.10);
		Produto p2 = new Produto("Notebook", 3500.00, 0.20);
		Produto p3 = new Produto("Caderno", 27.00, 0.03);
		Produto p4 = new Produto("Borracha", 7.5, 0.18);
		Produto p5 = new Produto("Lapis", 4.95, 0.19);
		
		imprimir.accept(p1);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);
		
		produtos.forEach(imprimir);
		
		produtos.forEach(p -> System.out.println(p.getPreco()));
		
		produtos.forEach(System.out::println);
	}
	
}
