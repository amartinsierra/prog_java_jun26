package com.cursojava.streams;

import java.util.Arrays;
import java.util.stream.Stream;

public class Test7 {

	public static void main(String[] args) {
		Stream<String[]> cursos=Stream.of(new String[]{"java","python","php"},
				new String[]{"angular","java","spring"},
				new String[]{"python","excel"}
				);
		//mostrar los nombres de todos cursos, evitando duplicados
		
		//cursos.flatMap(a->Arrays.stream(a))//Stream<String>
		cursos.flatMap(Arrays::stream)//Stream<String>
		.distinct()
		.forEach(System.out::println);
	}

}
