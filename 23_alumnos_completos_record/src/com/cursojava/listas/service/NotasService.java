package com.cursojava.listas.service;

import java.util.ArrayList;

import com.cursojava.listas.model.Alumno;

public class NotasService {
	ArrayList<Alumno> alumnos=new ArrayList<>();
	public boolean guardarAlumno(Alumno alumno) {
		for(Alumno al:alumnos) {
			if(al.nombre().equals(alumno.nombre())&&al.curso().equals(alumno.curso())) {
				return false;
			}
		}
		return alumnos.add(alumno);
	}
	public int aprobados() {
		int aprobados=0;
		for(Alumno a:alumnos) {
			if(a.nota()>=5) {
				aprobados++;
			}
		}
		return aprobados;
	}
	public double media() {
		double suma=0;
		for(Alumno a:alumnos) {
			suma+=a.nota();
		}
		return suma/alumnos.size();
	}
	public ArrayList<Alumno> recuperarAlumnos(){
		return alumnos;
	}
}
