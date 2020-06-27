package br.com.home.stream.outros;

import java.util.Arrays;
import java.util.List;

import br.com.home.Aluno;

public class OutrosMetodosStreamMain {
	
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ana", 7.9);
		Aluno a2 = new Aluno("Luna", 7.1);
		Aluno a3 = new Aluno("Gui", 9.1);
		Aluno a4 = new Aluno("Gabi", 10);
		Aluno a5 = new Aluno("Ana", 8.1);
		Aluno a6 = new Aluno("Pedro", 5.1);
		Aluno a7 = new Aluno("Gui", 9.1);
		Aluno a8 = new Aluno("Maria", 10);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a7, a6, a8);
		
		System.out.println("distinct...");
		alunos.stream().distinct().forEach(System.out::println);
		
		System.out.println("\nSkip/Limit");
		alunos.stream().distinct().skip(2).limit(2).forEach(System.out::println);
		
		System.out.println("\ntakeWhile");
		alunos.stream().distinct().takeWhile(a -> a.nota >= 7).forEach(System.out::println);
	}

}
