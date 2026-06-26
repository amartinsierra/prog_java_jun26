package com.cursojava.streams;

import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		Stream<Integer> st=Stream.of(9,-3,-7,2,1,4,-3,8,2,-11,5,1);
		
			st
			.parallel() //El mismo tipo Stream, pero por detras funciona en modo multitarea
			.filter(n->n>0)
			.distinct()
			.sequential() //convierte el stream paralelo a secuencial (anula multitarea)
			.forEach(System.out::println);
	

	}

}
