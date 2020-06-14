package br.com.home;

public class Aluno {
	
	public final String nome;
	
	public final double nota;

	public Aluno(String nome, double nota) {
		this.nome = nome;
		this.nota = nota;
	}
	
	public String imprimirNotaAluno() {
		return String.format("%s tem a nota %.2f", this.nome, this.nota);
	}

}
