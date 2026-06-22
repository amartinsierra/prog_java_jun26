package com.cursojava.repetitivas;

public class SumarPares {

	public static void main(String[] args) {
		int n1=21;
		int n2=11;
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
