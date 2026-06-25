package com.cursojava.streams;

import java.util.stream.Stream;

public class Test2 {

	public static void main(String[] args) {
		Stream<Integer> st=Stream.of(11,9,-2,3,8,11,-5,3);
		//cuantos números distintos hay
		System.out.println(
				st
				.distinct()
				.count()
				);
		
		
	}

}
