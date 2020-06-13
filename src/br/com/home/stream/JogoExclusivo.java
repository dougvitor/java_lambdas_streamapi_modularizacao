package br.com.home.stream;

public class JogoExclusivo {
	
	private String titulo;
	
	private Genero genero;
	
	private Plataforma plataforma;
	
	public JogoExclusivo(String titulo, Genero genero, Plataforma plataforma) {
		this.titulo = titulo;
		this.plataforma = plataforma;
		this.genero = genero;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Plataforma getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(Plataforma plataforma) {
		this.plataforma = plataforma;
	}
	
	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	
}

enum Genero{
	ESPORTE, FPS, AVENTURA, LUTA, CORRIDA
}

enum Plataforma {
	PS4, XBOX;
}
