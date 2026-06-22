package com.cursojava.string;

import java.util.Scanner;

public class ContarVocales {

	public static void main(String[] args) {
		//Leer un texto por teclado e indicar el total de
		//vocales que tiene el texto
		String texto;
		Scanner scan=new Scanner(System.in);
		System.out.println("Introduce un texto: ");
		texto=scan.nextLine();
		texto=texto.toLowerCase();
		int vocales=0;
		for(int i=0;i<texto.length();i++) {
			switch(texto.charAt(i)) {
				case 'a','e','i','o','u':
					vocales++;
			}
		}
		System.out.println("Total vocales: "+vocales);


	}

}
