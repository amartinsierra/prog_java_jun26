package com.cursojava.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test9 {

	public static void main(String[] args) {
		Stream<Integer> st=Stream.of(11,9,-2,3,8,11,-5,3);
		//lista con los positivos
		
		List<Integer> positivos=st.filter(n->n>0)
								//.collect(Collectors.toList())
								.toList();
								

	}

}
