package com.cursojava.streams;

import java.util.stream.Stream;

public class Test6 {

	public static void main(String[] args) {
		Stream<String> st=Stream.of("camello","grua","calabaza","mir");
		//contar el total de caracteres
		System.out.println(
				st.mapToInt(String::length) //IntStream
				.sum()
				);

	}

}
