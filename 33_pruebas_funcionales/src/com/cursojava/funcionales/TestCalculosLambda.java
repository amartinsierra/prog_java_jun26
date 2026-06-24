package com.cursojava.funcionales;

import java.util.List;

public class TestCalculosLambda {

	public static void main(String[] args) {
		List<Integer> numeros=List.of(20,8,11,-3,0,9,-4);
		var calculos=new Calculos();
		//mostrar los pares
		calculos.mostrarPorCriterio(numeros, n->n%2==0);
		//mostrar los positivos
		calculos.mostrarPorCriterio(numeros, n->n>0);
	}

}
