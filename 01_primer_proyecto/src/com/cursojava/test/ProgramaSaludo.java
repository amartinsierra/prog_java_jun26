package com.cursojava.test;

public class ProgramaSaludo {
	//var t=4 No se puede usar inferencia de tipos con variables atributo
	public static void main(String[] args) {
		System.out.println("Bienvenido a Java");
		int n=10;
		int c=n*2;
		System.out.println(n);
		var m=5;
		System.out.println(m/4);
		System.out.println(m/4.0);
		//System.out.println(m++);//5
		System.out.println(++m);
	}

}
