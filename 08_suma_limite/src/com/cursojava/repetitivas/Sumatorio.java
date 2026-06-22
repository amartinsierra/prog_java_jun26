package com.cursojava.repetitivas;

public class Sumatorio {

	public static void main(String[] args) {
		final int LIMITE=500;
		//hasta que que número tendremos sumar, empezado por 1, para
		//alcanzar el límite
		//1+2+3+4..+?
		int suma=0;
		int contador=0;
		while(suma<LIMITE) {
			/*contador++;
			suma+=contador;*/
			suma+=++contador;
		}
		System.out.println("Hemos llegado hasta el "+contador);

	}

}
