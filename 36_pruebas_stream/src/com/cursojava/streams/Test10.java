package com.cursojava.streams;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import java.util.stream.Stream;

public class Test10 {

	public static void main(String[] args) {
		Stream<Integer> st=Stream.of(11,9,-2,3,8,11,-5,3);
		//media de números positivos
		/*System.out.println(
			st.filter(n->n>0)
			.mapToInt(n->n) //IntStream
			.average() //OptionalDouble
			.getAsDouble()
		);*/
		System.out.println(
				st.filter(n->n>0)
				.collect(Collectors.averagingDouble(n->n))
			);
		
	}

}
