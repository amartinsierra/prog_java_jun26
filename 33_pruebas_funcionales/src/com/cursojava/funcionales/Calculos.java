package com.cursojava.funcionales;

import java.util.List;

public class Calculos {
	    //realizar un método que reciba una lista de números
		//y muestre los pares
		/*
		public void mostrarPares (List<Integer> numeros) {
			for(int n:numeros) {
				if(n%2==0) {
					System.out.println(n);
				}
			}
		}
		
		//método que recibe lista de números y muestra los positivos
		public void mostrarPositivos(List<Integer> numeros) {
			for(int n:numeros) {
				if(n>0) {
					System.out.println(n);
				}
			}
		}*/
		
		public void mostrarPorCriterio(List<Integer> numeros,Criterio criterio) {
			for(int n:numeros) {
				if(criterio.comprobar(n)) {
					System.out.println(n);
				}
			}
		}
}
