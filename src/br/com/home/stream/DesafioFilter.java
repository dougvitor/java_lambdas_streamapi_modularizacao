package br.com.home.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {
	
	public static void main(String[] args) {
		
		JogoExclusivo theLastOfUsRemastered = new JogoExclusivo("The Last Of Us Remastered", Genero.AVENTURA, Plataforma.PS4);
		JogoExclusivo grandTurismoSport = new JogoExclusivo("Grand Turismo Sport", Genero.CORRIDA, Plataforma.PS4);
		JogoExclusivo driveClub = new JogoExclusivo("Driveclub", Genero.CORRIDA, Plataforma.PS4);
		JogoExclusivo horizonZeroDawn = new JogoExclusivo("Horizon Zero Dawn", Genero.AVENTURA, Plataforma.PS4);
		JogoExclusivo forza6 = new JogoExclusivo("Forza Motorsport 6", Genero.CORRIDA, Plataforma.XBOX);
		JogoExclusivo gears5 = new JogoExclusivo("Gears 5", Genero.AVENTURA, Plataforma.XBOX);
		JogoExclusivo halo5 = new JogoExclusivo("Halo 5: Guardians", Genero.FPS, Plataforma.XBOX);
		JogoExclusivo killerInstict = new JogoExclusivo("Killer Instinct", Genero.LUTA, Plataforma.XBOX);
		
		List<JogoExclusivo> jogosExclusivos = Arrays.asList(theLastOfUsRemastered, grandTurismoSport, driveClub, horizonZeroDawn, forza6, gears5, halo5, killerInstict);
		
		Predicate<? super JogoExclusivo> plataformaFavorita = game -> game.getPlataforma() == Plataforma.PS4;
		
		Predicate<? super JogoExclusivo> generoPreferido = game -> game.getGenero() == Genero.CORRIDA;
		
		Function<JogoExclusivo, String> exibicao = 
				game -> String.format("%s é um dos meus jogos de %s favoritos e exclusivo para o %s.", game.getTitulo(), game.getGenero().name().toLowerCase(), game.getPlataforma());
		
		Consumer<? super String> impressao = System.out::println;
		
		jogosExclusivos
			.parallelStream()
			.filter(plataformaFavorita)
			.filter(generoPreferido)
			.map(exibicao)
			.forEach(impressao);
	}

}
