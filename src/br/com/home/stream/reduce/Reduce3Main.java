package br.com.home.stream.reduce;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import br.com.home.Aluno;
import br.com.home.Media;

public class Reduce3Main {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Luna", 6.1);
		Aluno a3 = new Aluno("Gui", 8.1);
		Aluno a4 = new Aluno("Gabi", 10);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
		
		Predicate<Aluno> aprovado = a -> a.nota >= 7;
		
		Function<Aluno, BigDecimal> apenasNota = a -> new BigDecimal(a.nota);
		
		BiFunction<Media, BigDecimal, Media> calcularMedia = (media, nota) -> media.adicionar(nota);
		
		BinaryOperator<Media> combinarMedia = (m1, m2) -> Media.combinar(m1, m2);// Não tem utilizade nenhuma, serve apenas para atender a assinatura do método reduce
		
		//Utilizar ParallelStream trazem resultados diferentes a cada execução
		Media media = alunos.stream()
				.filter(aprovado)
				.map(apenasNota)
				.reduce(new Media(), calcularMedia, combinarMedia);
		
		System.out.println(String.format("A média dos alunos aprovados é %s", media.getValor().toPlainString()));
	}

}
