package com.cursojava.streams;

import java.util.stream.Stream;

public class Test4 {

	public static void main(String[] args) {
		Stream<Integer> st=Stream.of(11,9,2,3,8,11,5,3);
		//muestra el primer número negativo, y si no hay ninguno
		//que muestre un mensaje que lo diga
		
		st.filter(n->n<0)
		.findFirst()
		.ifPresentOrElse(n->System.out.print(n), ()->System.out.println("No hay negativos"));

	}

}
