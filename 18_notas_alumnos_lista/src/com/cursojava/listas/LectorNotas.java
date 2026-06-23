package com.cursojava.listas;

import java.util.ArrayList;
import java.util.Scanner;

public class LectorNotas {

	public static void main(String[] args) {
		//realizar un programa que lea las notas de alumnos,
		//y las guarde en una lista.
		//Las notas deben estar entre 1 y 10. Si se introduce un número
		//fuera de ese rango, se pedirá que lo vuelva a repetir. 
		//Después de guardar la nota, preguntará si se quiere añadir otra. Si es así, 
		//se solicitará una nueva y así hasta que diga que no
		//Finalmente, indicará: total de aprobados y nota media global

		ArrayList<Integer> notas=new ArrayList<>();
		rellenarNotas(notas);	
		System.out.println("El total de aprobados es "+aprobados(notas));
		System.out.println("Nota media: "+media(notas));
	}
	static void rellenarNotas(ArrayList<Integer> datos){
		Scanner scan=new Scanner(System.in);
		String respuesta="s";
		int nota;
		while(respuesta.equals("s")) {
			System.out.println("Introduce nota");
			nota=Integer.parseInt(scan.nextLine());
			if(nota>=1&&nota<=10) {
				datos.add(nota);
				System.out.println("¿Desea introducir otra nota?(s/n)");
				respuesta=scan.nextLine();
			}else {
				System.out.println("La nota no es válida!, debe estar entre 1 y 10");
			}
		}
	}
	
	static int aprobados(ArrayList<Integer> datos) {
		int aprobados=0;
		for(int n:datos) {			
			if(n>=5) {
				aprobados++;
			}
		}
		return aprobados;
	}
	static double media(ArrayList<Integer> datos) {
		double suma=0;
		for(int n:datos) {
			suma+=n;
		}
		return suma/datos.size();
	}

}
