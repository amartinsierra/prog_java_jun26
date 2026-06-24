package com.cursojava.instance;

public class CoincidenciaPatrones {
	//Java 21
	public static void main(String[] args) {
		Object ob=100;//recibimos un dato;
		switch(ob) {
			case Integer n->System.out.println(n*n);
			case String s->System.out.println(s.length());
			default->System.out.println("Objeto desconocido");
		}
				

	}

}
