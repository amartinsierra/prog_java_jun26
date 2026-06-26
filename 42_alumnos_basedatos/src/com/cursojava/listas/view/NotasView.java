package com.cursojava.listas.view;

import java.util.List;
import java.util.Scanner;

import com.cursojava.listas.model.Alumno;
import com.cursojava.listas.service.NotasService;

public class NotasView {
	static NotasService notasService=new NotasService();
	public static void main(String[] args) {
		//bucle que muestra el menú mientras la opcion
		//sea diferente a salir
		int opcion=5;
		Scanner scan=new Scanner(System.in);
		do {
			try {
				//mostrar menú
				menu();
	
				opcion=Integer.parseInt(scan.nextLine());
				switch(opcion) {
					case 1->guardarNota();
		
					case 2->alumnosCurso();
		
					case 3->mostrarMedia();
		
					case 4->mostrarNotas();
					case 5->eliminar();	
					case 6->System.out.println("Adios");
				}
			}catch(NumberFormatException ex) {
				ex.printStackTrace();
				System.out.println("Error en la opción");
				opcion=7;
			}
			
		}while(opcion!=6);
	}
	
	//método para mostrar el menú
	static void menu() {
		System.out.println("1.- Introducir alumno");
		System.out.println("2.- Alumnos por curso");
		System.out.println("3.- Mostrar media");
		System.out.println("4.- Alumno aventajado");
		System.out.println("5.- Eliminar por id");
		System.out.println("6.- Salir");
	}
	//método para pedir la nota y guardarla
	static void guardarNota() {
		Scanner scan=new Scanner(System.in);
		try {
			System.out.println("Introduce id: ");
			int id=Integer.parseInt(scan.nextLine());
			System.out.println("Introduce nota: ");
			double nota=Double.parseDouble(scan.nextLine());
			System.out.println("Introduce nombre: ");
			String nombre=scan.nextLine();
			System.out.println("Introduce curso: ");
			String curso=scan.nextLine();
			if(notasService.guardarAlumno(new Alumno(id,nombre,curso,nota))) {
				System.out.println("Alumno añadido!!");
			}else {
				System.out.println("No se puede repetir la misma combinación nombre y curso!!");
			}
		}catch(NumberFormatException ex) {
			ex.printStackTrace();
			System.out.println("Datos introducidos no válidos "+ex.getMessage());
		}
		
	}
	//método para mostrar media
	static void mostrarMedia() {
		System.out.println("Media: "+notasService.notaMedia());
	}
	//método para mostrar aprobados
	static void alumnosCurso() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Introduce curso: ");
		String curso=scan.nextLine();
		List<Alumno> alumnos=notasService.alumnosPorCurso(curso);
		alumnos.forEach(System.out::println);
	}
	//método para eliminar por id
		static void eliminar() {
			Scanner scan=new Scanner(System.in);
			System.out.println("Introduce id: ");
			int id=Integer.parseInt(scan.nextLine());
			notasService.eliminarAlumno(id);
		}
	//método para mostrar todas las notas
	static void mostrarNotas() {
		notasService.getAlumnoMayorNota().ifPresentOrElse(System.out::println, ()->System.out.println("No se encontró alumno"));		
	}
}
