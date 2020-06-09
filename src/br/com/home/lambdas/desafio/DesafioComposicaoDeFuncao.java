package br.com.home.lambdas.desafio;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

import br.com.home.lambdas.predicate.Produto;

public class DesafioComposicaoDeFuncao {

	public static void main(String[] args) {
		
		Produto iPad = new Produto("iPad", 3235.89, 0.13);
		
		BinaryOperator<Double> precoComDesconto = (precoBruto, desconto) -> precoBruto * (1 - desconto);
		
		UnaryOperator<Double> precoComImpostoMunicipal = preco -> preco >= 2500.00 ? preco * (1 + (8.5 / 100)) : preco;
		
		UnaryOperator<Double> precoComFrete = preco -> preco >= 3000.00 ? preco + 100 : preco + 50;
		
		Function<Double, BigDecimal> arredondamento = preco -> {
			BigDecimal valor = new BigDecimal(preco);
			return valor.setScale(2, RoundingMode.HALF_UP);
		};
		
		Function<BigDecimal, String> formatar = valor -> String.format("R$ %s", valor.toPlainString().replace(".", ","));
		
		String preco = precoComDesconto
			.andThen(precoComImpostoMunicipal)
			.andThen(precoComFrete)
			.andThen(arredondamento)
			.andThen(formatar)
			.apply(iPad.getPreco(), iPad.getDesconto());
		
		System.out.println(String.format("O preço final é %s", preco));

	}

}
