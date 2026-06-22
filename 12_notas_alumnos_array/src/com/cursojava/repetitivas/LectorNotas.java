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

		Scanner scan=new Scanner(System.in);
		int aprobados=0;
		int totalValidas=0;
		int[] notas=new int[5];
		int nota;
		double suma=0;
		while(totalValidas<5) {
			System.out.println("Introduce nota");
			nota=scan.nextInt();
			if(nota>=1&&nota<=10) {
				notas[totalValidas]=nota;
				totalValidas++;
			}else {
				System.out.println("La nota no es válida!, debe estar entre 1 y 10");
			}
		}
		
		for(int n:notas) {
			suma+=n;
			if(n>=5) {
				aprobados++;
			}
		}
		
		System.out.println("El total de aprobados es "+aprobados);
		System.out.println("Nota media: "+suma/notas.length);
	}

}
