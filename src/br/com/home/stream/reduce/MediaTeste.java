package br.com.home.stream.reduce;

import java.math.BigDecimal;

import br.com.home.Media;

public class MediaTeste {
	
	public static void main(String[] args) {
		
		Media m1 = new Media().adicionar(new BigDecimal(8.3)).adicionar(new BigDecimal(6.7));
		Media m2 = new Media().adicionar(new BigDecimal(7.9)).adicionar(new BigDecimal(6.6));
		
		System.out.println(m1.getValor());
		System.out.println(m2.getValor());
		
		System.out.println(Media.combinar(m1, m2).getValor());
	}

}
