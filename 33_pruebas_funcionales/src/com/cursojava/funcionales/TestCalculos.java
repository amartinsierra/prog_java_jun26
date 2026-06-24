package com.cursojava.funcionales;

import java.util.List;

public class TestCalculos {

	public static void main(String[] args) {
		List<Integer> numeros=List.of(20,8,11,-3,0,9,-4);
		var calculos=new Calculos();
		//mostrar los pares
		calculos.mostrarPorCriterio(numeros, new CriterioPar());
		//mostrar los positivos
		calculos.mostrarPorCriterio(numeros, new CriterioPositivos());
	}

}
class CriterioPar implements Criterio{

	@Override
	public boolean comprobar(Integer n) {
		return n%2==0;
	}
	
}
class CriterioPositivos implements Criterio{
	@Override
	public boolean comprobar(Integer n) {
		return n>0;
	}
}
