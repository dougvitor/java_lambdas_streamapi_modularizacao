package br.com.home.lambdas.predicate;

import java.util.function.Predicate;

public class PredicateMain {
	
	public static void main(String[] args) {
		
		Predicate<Produto> isCaro = 
				prod -> (prod.preco * (1 - prod.desconto)) >= 3000.00;
		
		System.out.println(isCaro.test(new Produto("Notebook", 5000.00, 0.45)));
	}

}
