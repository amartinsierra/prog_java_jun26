package com.cursojava.nuevosmetodos;

import java.util.ArrayList;
import java.util.List;

public class OperarLista {

	public static void main(String[] args) {
		List<Integer> numeros=new ArrayList<>(List.of(8,-3,9,11,-7,23,5,-1,8));
		//eliminar los negativos, trasformar cada número en su cuadrado, ordenarlos y mostrarlos
		numeros.removeIf(n->n<0);
		numeros.replaceAll(n->n*n);
		numeros.sort((a,b)->a-b);
		numeros.forEach(n->System.out.println(n));

	}

}
