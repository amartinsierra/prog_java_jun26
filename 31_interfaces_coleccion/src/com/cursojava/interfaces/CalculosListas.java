package com.cursojava.interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class CalculosListas {
	//realizar un método que reciba una lista de números
	//y muestre los pares
	
	public void mostrarPares (List<Integer> numeros) {
		for(int n:numeros) {
			if(n%2==0) {
				System.out.println(n);
			}
		}
	}
	
	
	//crear un método que reciba una lista de números, un conjunto de numeros
	//y devuelva una lista con los valores comunes en ambas colecciones
	public List<Integer> comunes(List<Integer> lista, Set<Integer> conjunto)
	{
		List<Integer> resultado = new ArrayList<>();
		
		for(int n: lista)
		{
			if(conjunto.contains(n))
			{
				resultado.add(n);
			}
		}
		
		return resultado;
	}
 
	
}
