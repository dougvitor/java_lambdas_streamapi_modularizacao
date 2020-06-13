package br.com.home;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Media {
	
	private BigDecimal total = BigDecimal.ZERO;
	private BigDecimal quantidade = BigDecimal.ZERO;
	
	public Media adicionar(BigDecimal valor) {
		total = total.add(valor);
		quantidade = quantidade.add(BigDecimal.ONE);
		return this;
	}
	
	public BigDecimal getValor() {
		return total.setScale(2, RoundingMode.HALF_UP).divide(quantidade).setScale(2, RoundingMode.HALF_UP);
	}
	
	public static Media combinar(Media m1, Media m2) {
		Media resultante = new Media();
		resultante.total = m1.total.add(m2.total);
		resultante.quantidade = m1.quantidade.add(m2.quantidade);
		return resultante;
	}

}
