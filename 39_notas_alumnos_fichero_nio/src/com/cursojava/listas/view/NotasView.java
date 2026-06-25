package com.cursojava.listas.view;

import java.util.Scanner;

import com.cursojava.listas.service.NotasService;

public class NotasView {
	static NotasService notasService=new NotasService();
	public static void main(String[] args) {
		//bucle que muestra el menú mientras la opcion
		//sea diferente a salir
		int opcion;
		Scanner scan=new Scanner(System.in);
		do {
			//mostrar menú
			menu();

			opcion=Integer.parseInt(scan.nextLine());
			switch(opcion) {
				case 1->guardarNota();
	
				case 2->totalAprobados();
	
				case 3->mostrarMedia();
	
				case 4->mostrarNotas();	
				case 5->System.out.println("Adios");
			}
			
		}while(opcion!=5);
	}
	
	//método para mostrar el menú
	static void menu() {
		System.out.println("1.- Introducir nota");
		System.out.println("2.- Total aprobados");
		System.out.println("3.- Mostrar media");
		System.out.println("4.- Mostrar notas");
		System.out.println("5.- Salir");
	}
	//método para pedir la nota y guardarla
	static void guardarNota() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Introduce nota: ");

		int nota=scan.nextInt();
		notasService.guardarNota(nota);
		
	}
	//método para mostrar media
	static void mostrarMedia() {
		System.out.println("Media: "+notasService.media());
	}
	//método para mostrar aprobados
	static void totalAprobados() {
		System.out.println("Aprobados: "+notasService.aprobados());
	}
	//método para mostrar todas las notas
	static void mostrarNotas() {
		for(int n:notasService.recuperarNotas()) {
			System.out.println("Nota: "+n);
		}		
	}
}
