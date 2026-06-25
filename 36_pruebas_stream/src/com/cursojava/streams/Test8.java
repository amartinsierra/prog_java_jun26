package com.cursojava.streams;

import java.util.Arrays;
import java.util.stream.Stream;

public class Test8 {

	public static void main(String[] args) {
		Stream<String> st=Stream.of("camello","grua","calabaza","mir");
		
		//¿cuantas vocales diferentes se utilizan en este stream?
		System.out.println(
			st.flatMap(c->Arrays.stream(c.toLowerCase().split("")))//Stream<String>
			.filter(l->"aeiou".indexOf(l)>-1)
			.distinct()
			.count()
		);
		/*long distintasVocales = Stream.of("camello", "grua", "calabaza", "mir")
                .flatMapToInt(String::chars) //IntStream
                .map(Character::toLowerCase)
                .filter(c -> "aeiou".indexOf(c) >= 0)
                .distinct()
                .count();

        System.out.println(distintasVocales);*/
	}

}
