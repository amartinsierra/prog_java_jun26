package com.cursojava.repetitivas;

import java.util.Scanner;

public class SumarPares {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Introduce un número: ");
		int n1=scan.nextInt();
		System.out.println("Introduce un segundo número: ");
		int n2=scan.nextInt();
		//realiza un programa que dados dos números cualquiera
		//muestre la suma de todos los pares comprendidos entre ambos números
		int mayor=(n1>n2)?n1:n2;
		int menor=(n1<n2)?n1:n2;
		int suma=0;
		for(int i=menor;i<=mayor;i++) {
			if(i%2==0) {
				suma+=i;
				
			}
		}
		System.out.println("El resultado de la suma es: "+suma);

	}

}
