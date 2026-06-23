package com.cursojava.listas.service;

import java.util.ArrayList;

public class NotasService {
	ArrayList<Integer> notas=new ArrayList<>();
	public void guardarNota(int nota) {
		notas.add(nota);
	}
	public int aprobados() {
		int aprobados=0;
		for(int n:notas) {
			if(n>=5) {
				aprobados++;
			}
		}
		return aprobados;
	}
	public double media() {
		double suma=0;
		for(int n:notas) {
			suma+=n;
		}
		return suma/notas.size();
	}
	public ArrayList<Integer> recuperarNotas(){
		return notas;
	}
}
