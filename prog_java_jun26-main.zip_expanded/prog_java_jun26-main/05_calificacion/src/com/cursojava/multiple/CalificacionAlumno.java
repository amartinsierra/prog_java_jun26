package com.cursojava.multiple;

public class CalificacionAlumno {

	public static void main(String[] args) {
		int nota=7;
		//muestre la calificación
		/*switch(nota) {
			case 0,1,2,3,4:
				System.out.println("Suspenso");
				break;
			case 5,6:
				System.out.println("Aprobado");
				break;
			case 7,8:
				System.out.println("Notable");
				break;
			case 9,10:
				System.out.println("Sobresaliente");
				break;
			default:
				System.out.println("Nota no válida");
			
		}*/
		var frase=switch(nota) {
			case 0,1,2,3,4->"Suspenso";
			case 5,6->"Aprobado";
			case 7,8->"Notable";
			case 9,10->"Sobresaliente";
			default->"Nota no válida";
		};
		System.out.println(frase);

	}

}
