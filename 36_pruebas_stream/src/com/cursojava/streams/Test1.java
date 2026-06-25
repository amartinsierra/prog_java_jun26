package com.cursojava.streams;

import java.util.stream.Stream;

public class Test1 {

	public static void main(String[] args) {
		Stream<Integer> st=Stream.of(11,9,-2,3,8,11,-5,3);
		Stream<Number> st2=Stream.of(2,6.7,0);
		st.forEach(n->System.out.println(n));
		System.out.println(st2.count());
		
	}

}
