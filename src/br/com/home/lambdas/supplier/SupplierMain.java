package br.com.home.lambdas.supplier;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierMain {
	
	public static void main(String[] args) {
		
		Supplier<List<String>> nomes = () -> Arrays.asList("Ana", "Bia", "Lia", "Chia");
		
		System.out.println(nomes.get());
		
	}

}
