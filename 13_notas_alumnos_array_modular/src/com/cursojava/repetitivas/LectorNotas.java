package com.cursojava.repetitivas;

import java.util.Scanner;

public class LectorNotas {

	public static void main(String[] args) {
		//realizar un programa que lea las notas de 5 alumnos,
		//y las guarde en un array.
		//Las notas deben estar entre 1 y 10. Si se introduce un número
		//fuera de ese rango, se pedirá que lo vuelva a repetir. Así
		//hasta obtener 5 notas válidas
		//una vez guardadas en el array, indicará: total de aprobados y nota media global

			
		int[] notas=new int[5];
		rellenarNotas(notas);	
		System.out.println("El total de aprobados es "+aprobados(notas));
		System.out.println("Nota media: "+media(notas));
	}
	
	
	static void rellenarNotas(int[] datos){
		Scanner scan=new Scanner(System.in);
		int totalValidas=0;
		int nota;
		while(totalValidas<datos.length) {
			System.out.println("Introduce nota");
			nota=scan.nextInt();
			if(nota>=1&&nota<=10) {
				datos[totalValidas]=nota;
				totalValidas++;
			}else {
				System.out.println("La nota no es válida!, debe estar entre 1 y 10");
			}
		}
	}
	
	static int aprobados(int[] datos) {
		int aprobados=0;
		for(int n:datos) {			
			if(n>=5) {
				aprobados++;
			}
		}
		return aprobados;
	}
	static double media(int[] datos) {
		double suma=0;
		for(int n:datos) {
			suma+=n;
		}
		return suma/datos.length;
	}

}
