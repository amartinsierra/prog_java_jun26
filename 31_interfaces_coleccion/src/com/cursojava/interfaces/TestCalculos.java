package com.cursojava.interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class TestCalculos {
	public static void main(String[] args) {
		var cal=new CalculosListas();
		ArrayList<Integer> lista1=new ArrayList<Integer>();
		lista1.add(20);lista1.add(5);lista1.add(44);
		cal.mostrarPares(lista1);	
		Vector<Integer> lista2=new Vector<Integer>();
		lista2.add(8);lista2.add(12);lista2.add(65);
		cal.mostrarPares(lista2);
		
		
		cal.mostrarPares(List.of(7,8,1,2));
	}
}
