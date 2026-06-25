package com.cursojava.streams;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class Test3 {

	public static void main(String[] args) {
		Stream<Integer> st=Stream.of(11,9,-2,3,8,11,-5,3);
		//hay algún negativo y menos que -10?
		Predicate<Integer> p1=n->n<0;
		System.out.println(st.anyMatch(p1.and(n->n<-10)));

	}

}
