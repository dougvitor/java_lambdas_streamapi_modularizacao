package br.com.home.lambdas.desafio;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.function.Function;
import java.util.function.UnaryOperator;

import br.com.home.lambdas.predicate.Produto;

public class RespostaDesafioComposicaoDeFuncao {
	
	public static void main(String[] args) {
		
		Produto iPad = new Produto("iPad", 3235.89, 0.13);
		
		Function<Produto, Double> precoFinal = produto -> produto.getPreco() * (1 - produto.getDesconto());
		
		UnaryOperator<Double> impostoMunicipal = preco -> preco >= 2500.00 ? preco * (1 + (8.5 / 100)) : preco;
		
		UnaryOperator<Double> frete = preco -> preco >= 3000.00 ? preco + 100 : preco + 50;
		
		Function<Double, BigDecimal> arredondar = preco -> {
			BigDecimal valor = new BigDecimal(preco);
			return valor.setScale(2, RoundingMode.HALF_UP);
		};
		
		Function<BigDecimal, String> formatar = valor -> String.format("R$ %s", valor.toPlainString().replace(".", ","));
		
		/*
		 * 
		 	a forma de arredondar abaixo não funciona pois dá NumberFormatException, devido ao ponto no lugar da virgula, que é esperada pelo parseDouble Locale.BR
			UnaryOperator<Double> arredondar = preco -> Double.parseDouble(String.format("%.2f", preco));
			
			com isso o formatar também fica inviável, pois não daria para receber um double
			Function<Double, String> formatar = preco -> ("R$ " + preco).replace(".", ",");
			
		 */
		
		String preco = precoFinal
			.andThen(impostoMunicipal)
			.andThen(frete)
			.andThen(arredondar)
			.andThen(formatar)
			.apply(iPad);
		
		System.out.println(String.format("O preço final é %s", preco));

	}


}
