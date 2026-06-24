package com.cursojava.arrays;

public class PruebaArray {

	public static void main(String[] args) {
		int[] numeros= {5,9,2,-4,7,23,-5,-11};
		//imprime los positivos
		for(int i=0;i<numeros.length;i++) {
			if(numeros[i]>0) {
				System.out.println(numeros[i]);
			}
		}
		for(int n:numeros) {
			if(n>0) {
				System.out.println(n);
			}
			
		}
		

	}

}
