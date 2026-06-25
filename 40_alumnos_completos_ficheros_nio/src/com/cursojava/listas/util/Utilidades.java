package com.cursojava.listas.util;

import com.cursojava.listas.model.Alumno;

public class Utilidades {
	public static Alumno filaToAlumno(String fila) {
		String[] datos=fila.split(",");
		return new Alumno(datos[0],datos[1],Integer.parseInt(datos[2]));
	}
	
	public static String alumnoToFila(Alumno alumno) {
		return alumno.getNombre()+","+alumno.getCurso()+","+alumno.getNota();
	}
}
