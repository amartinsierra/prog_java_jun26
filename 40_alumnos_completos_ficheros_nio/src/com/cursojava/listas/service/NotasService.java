package com.cursojava.listas.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.cursojava.listas.model.Alumno;
import com.cursojava.listas.util.Utilidades;

public class NotasService {
	final Path RUTA=Path.of("c:\\temp\\alumnos.csv");
	
	public NotasService() {
		//comprobamos si existe el fichero y si no existe se crea		
		if(!Files.exists(RUTA)) {
			try {
				Files.createFile(RUTA);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public boolean guardarAlumno(Alumno alumno) {
		try {
			if(Files.lines(RUTA)
					.map(a->Utilidades.filaToAlumno(a))
					.anyMatch(a->a.getNombre().equals(alumno.getNombre())&&a.getCurso().equals(alumno.getCurso()))) {
				return false;
			}
			Files.writeString(RUTA, Utilidades.alumnoToFila(alumno), StandardOpenOption.APPEND);
			return true;
		}catch(IOException ex) {
			ex.printStackTrace();
			return false;
		}
	}
	public List<Alumno> alumnosCurso(String curso) {
		try {
			return Files.lines(RUTA)
					.map(a->Utilidades.filaToAlumno(a))
					.filter(a->a.getCurso().equals(curso))
					.toList();
		}catch(IOException ex) {
			ex.printStackTrace();
			return List.of();
		}
	}
	public double media() {
		try {
			return Files.lines(RUTA)
					.map(a->Utilidades.filaToAlumno(a))
					.collect(Collectors.averagingDouble(a->a.getNota()));
		}catch(IOException ex) {
			ex.printStackTrace();
			return 0;
		}
	}
	public Optional<Alumno> alumnoAventajado(){
		try {
			return Files.lines(RUTA)
					.map(a->Utilidades.filaToAlumno(a))
					.max(Comparator.comparingDouble(a->a.getNota()));
		}catch(IOException ex) {
			ex.printStackTrace();
			return Optional.empty();
		}
	}
}
