package br.com.home.lambdas.predicate;

import java.util.function.Predicate;

public class PredicateMain {
	
	public static void main(String[] args) {
		
		Predicate<Produto> isCaro = 
				prod -> (prod.getPreco() * (1 - prod.getDesconto())) >= 3000.00;
		
		System.out.println(isCaro.test(new Produto("Notebook", 5000.00, 0.40)));
	}

}
