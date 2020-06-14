package br.com.home.stream.minmax;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import br.com.home.Aluno;

public class MinMaxMain {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Luna", 6.1);
		Aluno a3 = new Aluno("Gui", 8.1);
		Aluno a4 = new Aluno("Gabi", 10);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
		
		Comparator<Aluno> melhorNota = (aluno1, aluno2) -> {
			if(aluno1.nota > aluno2.nota) return 1;
			if(aluno1.nota < aluno2.nota) return -1;
			return 0;
		};
		
		Comparator<Aluno> piorNota = (aluno1, aluno2) -> {
			if(aluno1.nota > aluno2.nota) return -1;
			if(aluno1.nota < aluno2.nota) return 1;
			return 0;
		};
		
		System.out.println(String.format("%s - Melhor Nota", alunos.stream().max(melhorNota).get().imprimirNotaAluno()));
		System.out.println(String.format("%s - Pior Nota", alunos.stream().min(melhorNota).get().imprimirNotaAluno()));
		
		System.out.println(String.format("%s - Pior Nota", alunos.stream().max(piorNota).get().imprimirNotaAluno()));
		System.out.println(String.format("%s - Melhor Nota",alunos.stream().min(piorNota).get().imprimirNotaAluno()));
		

	}

}
