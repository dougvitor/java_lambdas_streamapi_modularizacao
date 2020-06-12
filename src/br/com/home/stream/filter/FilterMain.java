package br.com.home.stream.filter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

import br.com.home.Aluno;

public class FilterMain {
	
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ana", 7.8);
		Aluno a2 = new Aluno("Bia", 5.8);
		Aluno a3 = new Aluno("Daniel", 9.8);
		Aluno a4 = new Aluno("Gui", 6.8);
		Aluno a5 = new Aluno("Rebecca", 7.1);
		Aluno a6 = new Aluno("Paulo", 8.8);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);
		
		Predicate<Aluno> isAprovado = a -> a.nota >= 7;
		
		Function<Aluno, String> mensagemAprovado = a -> "Parabéns " + a.nome + "! Você foi aprovado(a)!";
		
		alunos.stream()
			.filter(isAprovado)
			.map(mensagemAprovado)
			.forEach(System.out::println);
		
	}

}
