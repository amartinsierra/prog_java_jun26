package com.cursojava.repetitivas;

import java.util.Scanner;

public class LectorNotas {

	public static void main(String[] args) {
		//realizar un programa que lea las notas de 5 alumnos,
		//y después nos muestre el total de aprobados.
		//Las notas deben estar entre 1 y 10. Si se introduce un número
		//fuera de ese rango, se pedirá que lo vuelva a repetir. Así
		//hasta obtener 5 notas válidas

		Scanner scan=new Scanner(System.in);
		int aprobados=0;
		int totalValidas=0;
		int nota;
		while(totalValidas<5) {
			System.out.println("Introduce nota");
			nota=scan.nextInt();
			if(nota>=1&&nota<=10) {
				if(nota>=5) {
					aprobados++;
				}
				totalValidas++;
			}else {
				System.out.println("La nota no es válida!, debe estar entre 1 y 10");
			}
		}
		System.out.println("El total de aprobados es "+aprobados);
	}

}
