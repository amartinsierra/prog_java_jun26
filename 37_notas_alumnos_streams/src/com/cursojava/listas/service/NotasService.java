package com.cursojava.listas.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NotasService {
	ArrayList<Integer> notas=new ArrayList<>();
	public void guardarNota(int nota) {
		notas.add(nota);
	}
	public int aprobados() {
		return (int)notas.stream()
				.filter(n->n>=5)
				.count();
	}
	public double media() {
		return notas.stream()
				.collect(Collectors.averagingDouble(n->n));
	}
	public List<Integer> recuperarNotas(){
		return notas;
	}
}
