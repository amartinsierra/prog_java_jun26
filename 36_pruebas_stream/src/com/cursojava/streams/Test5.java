package com.cursojava.streams;

import java.util.Comparator;
import java.util.stream.Stream;

public class Test5 {
	public static void main(String[] args) {
		Stream<Integer> st=Stream.of(11,9,2,3,8,11,5,3);
		//mostrar el más pequeño
		System.out.println(
				//st.min((n1,n2)->n1-n2)
				//st.min(Comparator.comparingInt(n->n))
				st.min((n1,n2)->Integer.compare(n1, n2))
				.get()
				);
		
	}
}
