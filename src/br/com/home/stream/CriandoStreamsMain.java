package br.com.home.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreamsMain {

	public static void main(String[] args) {
		
		Consumer<String> print = System.out::print;
		
		Consumer<Integer> println = System.out::println;
		
		Stream<String> langs = Stream.of("Java ", "Lua ", "JS\n");
		langs.forEach(print);
		
		String[] maisLangs = {"Python ", "Lisp ", "Perl ", "Go\n"};
		
		Stream.of(maisLangs).forEach(print);
		
		Arrays.stream(maisLangs).forEach(print);
		Arrays.stream(maisLangs, 1, 3).forEach(print);
		
		List<String> outrasLangs = Arrays.asList("C ", "PHP ", "Kotlin\n");
		outrasLangs.stream().forEach(print);
		outrasLangs.parallelStream().forEach(print);
		
		/* Gera uma stream atrav�s de um consumer que gera uma vogal "a" infinitamente
		Stream.generate(()-> "a").forEach(print);*/
		
		/* Gera uma stream atrav�s de uma unary operator que gera n�meros infinitamente
		Stream.iterate(0,  n -> n + 1).forEach(println); */

	}

}
