package com.cursojava.listas.service;

import java.util.ArrayList;

import com.cursojava.listas.model.Alumno;

public class NotasService {
	ArrayList<Alumno> alumnos=new ArrayList<>();
	public boolean guardarAlumno(Alumno alumno) {
		for(Alumno al:alumnos) {
			if(al.getNombre().equals(alumno.getNombre())&&al.getCurso().equals(alumno.getCurso())) {
				return false;
			}
		}
		return alumnos.add(alumno);
	}
	public int aprobados() {
		int aprobados=0;
		for(Alumno a:alumnos) {
			if(a.getNota()>=5) {
				aprobados++;
			}
		}
		return aprobados;
	}
	public double media() {
		double suma=0;
		for(Alumno a:alumnos) {
			suma+=a.getNota();
		}
		return suma/alumnos.size();
	}
	public ArrayList<Alumno> recuperarAlumnos(){
		return alumnos;
	}
}
